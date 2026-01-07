DROP TABLE Orders_Staging;
DROP TABLE Orders_Production;
DROP TABLE Customers;
-- Create tables for the project scenarios
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR2(100),
    country VARCHAR2(50)
);
CREATE TABLE Orders_Staging (
    order_id INT PRIMARY KEY,
    customer_id INT,
    total_amount NUMBER(10, 2),
    order_date DATE
);
CREATE TABLE Orders_Production (
    order_id INT, -- Removed PRIMARY KEY to allow Scenario 2 (Duplicates)
    customer_id INT,
    total_amount NUMBER(10, 2),
    order_date DATE
);
-- Populate Customers
INSERT INTO Customers VALUES (1, 'John Doe', 'USA');
INSERT INTO Customers VALUES (2, 'Jane Smith', 'UK');
INSERT INTO Customers VALUES (3, 'Alice Wong', 'Japan');
-- Automated Data Generation with Seeded Bugs
BEGIN
    FOR i IN 1..1000 LOOP
        -- Generate base data for Staging
        INSERT INTO Orders_Staging (order_id, customer_id, total_amount, order_date)
        VALUES (i,
                MOD(i, 3) + 1,
                ROUND(DBMS_RANDOM.VALUE(10, 500), 2),
                TRUNC(SYSDATE) - MOD(i, 10));
        ---------------------------------------------------------
        -- SCENARIO 1: Ghost Orders (Customer 999 doesn't exist)
        ---------------------------------------------------------
        IF i = 50 THEN
            INSERT INTO Orders_Production (order_id, customer_id, total_amount, order_date)
            VALUES (i, 999, 100.00, TRUNC(SYSDATE));
        ---------------------------------------------------------
        -- SCENARIO 2: Duplicate Revenue (Double insert for ID 100)
        ---------------------------------------------------------
        ELSIF i = 100 THEN
            -- Insert twice
            FOR d IN 1..2 LOOP
                INSERT INTO Orders_Production (order_id, customer_id, total_amount, order_date)
                SELECT order_id, customer_id, total_amount, order_date
                FROM Orders_Staging WHERE order_id = 100;
            END LOOP;
        ---------------------------------------------------------
        -- SCENARIO 3: Currency Chaos (Rounding decimals to zero)
        ---------------------------------------------------------
        ELSIF i BETWEEN 200 AND 210 THEN
            INSERT INTO Orders_Production (order_id, customer_id, total_amount, order_date)
            SELECT order_id, customer_id, ROUND(total_amount, 0), order_date
            FROM Orders_Staging WHERE order_id = i;
        ---------------------------------------------------------
        -- SCENARIO 4: Timezone Shift (Shift dates by +1 day)
        ---------------------------------------------------------
        ELSIF i > 900 THEN
            INSERT INTO Orders_Production (order_id, customer_id, total_amount, order_date)
            SELECT order_id, customer_id, total_amount, order_date + 1
            FROM Orders_Staging WHERE order_id = i;
        -- DEFAULT: Perfect Copy
        ELSE
            INSERT INTO Orders_Production (order_id, customer_id, total_amount, order_date)
            SELECT order_id, customer_id, total_amount, order_date
            FROM Orders_Staging WHERE order_id = i;
        END IF;
    END LOOP;
    COMMIT;
END;
/




-- The Scenario
-- You are testing a high-stakes data migration. You have been told that 25 orders were migrated from the Orders_Staging table to the Orders_Production table. However, the Finance department is complaining that the total revenue numbers don't match their spreadsheets.

-- The Mystery
-- The row counts match (both tables have 25 rows).
-- There are no NULL values in the total_amount column.
-- All customer_ids exist in the Customers table.

-- Your Task
-- Write a PL/SQL Anonymous Block that performs a "Column-Level Reconciliation."
-- You must compare the total_amount of each order_id between the two tables and print only the order_ids where the amounts differ, even though the rows exist in both.

-- Challenge Requirements
-- Use a FOR loop to iterate through Orders_Production.
-- Inside the loop, fetch the corresponding total_amount from Orders_Staging.
-- Handle the case where an order_id might be missing using an EXCEPTION or an IF check.
-- Print the "Discrepancy" for any mismatches found.

-- Hints
-- Scenario        | Validation logic                                               | SQL command to use 
-- 1. Ghost Orders | Order 50 has a customer_id that isn't in the Customers table.  | NOT IN or LEFT JOIN
-- 2. Duplicates   | Order 100 appears twice in Orders_Production.                  | GROUP BY ... HAVING COUNT(*) > 1
-- 3. Rounding     | Orders 200–210 have .00 in Production but decimals in Staging. | WHERE s.amount != p.amount
-- 4. Timezone     | Orders 901–1000 have the wrong date.                           | WHERE s.order_date != p.order_date

-- Hints
-- Scenario        | Validation logic                                               | SQL command to use 
-- 1. Ghost Orders | Order 50 has a customer_id that isn't in the Customers table.  | NOT IN or LEFT JOIN
-- 2. Duplicates   | Order 100 appears twice in Orders_Production.                  | GROUP BY ... HAVING COUNT(*) > 1
-- 3. Rounding     | Orders 200–210 have .00 in Production but decimals in Staging. | WHERE s.amount != p.amount
-- 4. Timezone     | Orders 901–1000 have the wrong date.                           | WHERE s.order_date != p.order_date




-- In line sql query

SELECT order_id, total_amount FROM Orders_Production
MINUS
SELECT order_id, total_amount FROM Orders_Staging

-- This will print the table with order id and total amount where there is discepency


-- PL/SQL Solution


DECLARE
   v_staging_amount   Orders_Staging.total_amount%TYPE;
   v_prod_amount      Orders_Production.total_amount%TYPE;
BEGIN
   FOR r IN (
      SELECT order_id, total_amount
      FROM   Orders_Production
      ORDER BY order_id
   ) LOOP

      v_prod_amount := r.total_amount;

      BEGIN 
         SELECT s.total_amount
         INTO   v_staging_amount
         FROM   Orders_Staging s
         WHERE  s.order_id = r.order_id;

         IF v_staging_amount <> v_prod_amount THEN
            DBMS_OUTPUT.PUT_LINE(
               'Discrepancy: order_id=' || r.order_id ||
               ' | staging_amount='    || TO_CHAR(v_staging_amount, 'FM9999990D00') ||
               ' | production_amount=' || TO_CHAR(v_prod_amount,  'FM9999990D00')
            );
         END IF;

      EXCEPTION
         WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE(
               'Missing in Staging: order_id=' || r.order_id ||
               ' | production_amount='         || TO_CHAR(v_prod_amount, 'FM9999990D00')
            );
      END;

   END LOOP;
END;
/




-- # Scenario 3: The "Duplicate Revenue" (Uniqueness/ETL Logic)
-- ## The Problem
-- The CEO noticed that the total revenue for yesterday is exactly double what was expected.
-- ## The Suspicion
-- You suspect the ETL job was accidentally run twice without a "Truncate" or "Delete" step, or the INSERT logic is missing a check for existing order_ids, resulting in every order being duplicated in the Production table.
-- ## Your Task
-- Write a PL/SQL block that counts how many order_ids appear more than once in Orders_Production and calculates the "Artificial Revenue" (the sum of the amounts of the duplicate rows).

SOlution:
DECLARE
    l_total_fake_revenue NUMBER := 0;
    l_duplicate_count    NUMBER := 0;
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- SCENARIO 2: DUPLICATE REVENUE AUDIT ---');

    -- We use a cursor with GROUP BY and HAVING to find the bad rows
    FOR r_dup IN (
        SELECT order_id, 
               COUNT(*) as occurrence_count, 
               SUM(total_amount) as total_sum,
               AVG(total_amount) as unit_amount
        FROM Orders_Production
        GROUP BY order_id
        HAVING COUNT(*) > 1
    ) LOOP
        -- Calculate the "Fake" part: (Total Sum) minus (One valid instance)
        -- e.g., If we have two $150 entries, $150 is fake.
        l_total_fake_revenue := l_total_fake_revenue + (r_dup.total_sum - r_dup.unit_amount);
        l_duplicate_count    := l_duplicate_count + 1;

        DBMS_OUTPUT.PUT_LINE('[DUPLICATE] Order ID: ' || r_dup.order_id || 
                             ' | Seen: ' || r_dup.occurrence_count || ' times' ||
                             ' | Excess Revenue: $' || (r_dup.total_sum - r_dup.unit_amount));
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('-------------------------------------------');
    DBMS_OUTPUT.PUT_LINE('Total Duplicate IDs Found: ' || l_duplicate_count);
    DBMS_OUTPUT.PUT_LINE('Total Artificial Revenue:  $' || l_total_fake_revenue);
    
END;
