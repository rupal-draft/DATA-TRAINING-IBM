-- Write a query to identify if there are any duplicate email addresses in the Customers table. Your query should return the email and the count of how many times it appears, but only for those that appear more than once.
-- Write a query to find all records in the Orders table where customer_id or total_amount is NULL.
-- Ensure every order belongs to a valid customer. Write a query to find any customer_id in the Orders table that does not exist in the Customers table.
-- Business rules state that a total_amount should never be negative or exceed $10,000. Write a query to pull all records from Orders that violate this rule.
-- You are comparing a "Staging" table to the "Production" table. Write a query that returns the total count of rows from both Orders_Staging and Orders_Production to see if they match.

-- Create the Dummy_Customers table
CREATE TABLE Dummy_Customers (
 customer_id INT PRIMARY KEY,
 customer_name VARCHAR(100),
 email VARCHAR(100),
 country VARCHAR(50)
);

-- Create the Dummy_Orders table
CREATE TABLE Dummy_Orders (
 order_id INT PRIMARY KEY,
 customer_id INT,
 order_date DATE,
 total_amount DECIMAL(10, 2)
);

INSERT ALL
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(1, 'John Doe', 'j.doe@email.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(2, 'Jane Smith', 'jane.s@example.com', 'UK')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(3, 'Bob Wilson', 'j.doe@email.com', 'Canada') -- Duplicate Email
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(4, 'Alice Brown', 'alice.b@tech.com', 'Germany')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(5, 'Charlie Davis', 'charlie.d@provider.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(6, 'Eva Martinez', 'eva.m@global.es', 'Spain')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(7, 'Frank Miller', 'f.miller@corp.net', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(8, 'Grace Lee', 'grace.lee@webmail.com', 'South Korea')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(9, 'Henry Wilson', 'h.wilson@service.com', 'Canada')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(10, 'Isabel Clark', 'i.clark@domain.com', 'Australia')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(11, 'Jack White', 'jack.w@music.com', 'UK')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(12, 'Kelly Green', 'k.green@nature.org', 'Ireland')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(13, 'Liam Neeson', 'liam.n@action.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(14, 'Mia Wong', 'mia.w@tech.cn', 'China')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(15, 'Noah Taylor', 'n.taylor@stats.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(16, 'Olivia Pope', 'o.pope@crisis.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(17, 'Paul Rudd', 'paul.r@ant.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(18, 'Quinn Fabray', 'q.fabray@glee.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(19, 'Riley Reid', 'r.reid@books.com', 'Canada')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(20, 'Sam Winchester', 's.winchester@hunt.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(21, 'Tara Knowles', 't.knowles@bikers.com', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(22, 'Victor Stone', 'jane.s@example.com', 'USA') -- Duplicate Email (matches ID 2)
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(23, 'Wendy Darling', 'w.darling@neverland.com', 'UK')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(24, 'Xavier Prof', 'x.prof@school.edu', 'USA')
 INTO Dummy_Customers (customer_id, customer_name, email, country) VALUES(25, 'Yara Greyjoy', NULL, 'UK') -- NULL Email
SELECT 1 FROM DUAL;

INSERT ALL
 INTO Dummy_Orders VALUES(101, 1, TO_DATE('2024-01-10', 'YYYY-MM-DD'), 150.00)
 INTO Dummy_Orders VALUES(102, 2, TO_DATE('2024-01-11', 'YYYY-MM-DD'), 2500.00)
 INTO Dummy_Orders VALUES(103, 1, TO_DATE('2024-01-12', 'YYYY-MM-DD'), -50.00) -- Rule Violation: Negative
 INTO Dummy_Orders VALUES(104, 3, TO_DATE('2024-01-13', 'YYYY-MM-DD'), NULL) -- Rule Violation: Null
 INTO Dummy_Orders VALUES(105, 99, TO_DATE('2024-01-14', 'YYYY-MM-DD'), 300.00) -- Referential Integrity: Orphan
 INTO Dummy_Orders VALUES(106, 5, TO_DATE('2024-01-15', 'YYYY-MM-DD'), 450.00)
 INTO Dummy_Orders VALUES(107, 6, TO_DATE('2024-01-16', 'YYYY-MM-DD'), 1200.50)
 INTO Dummy_Orders VALUES(108, 7, TO_DATE('2024-01-17', 'YYYY-MM-DD'), 89.99)
 INTO Dummy_Orders VALUES(109, 8, TO_DATE('2024-01-18', 'YYYY-MM-DD'), 500.00)
 INTO Dummy_Orders VALUES(110, 4, TO_DATE('2024-01-19', 'YYYY-MM-DD'), 12000.00) -- Rule Violation: Exceeds 10k
 INTO Dummy_Orders VALUES(111, 10, TO_DATE('2024-01-20', 'YYYY-MM-DD'), 340.00)
 INTO Dummy_Orders VALUES(112, 11, TO_DATE('2024-01-21', 'YYYY-MM-DD'), 15.00)
 INTO Dummy_Orders VALUES(113, 12, TO_DATE('2024-01-22', 'YYYY-MM-DD'), 999.00)
 INTO Dummy_Orders VALUES(114, 13, TO_DATE('2024-01-23', 'YYYY-MM-DD'), 250.00)
 INTO Dummy_Orders VALUES(115, 14, TO_DATE('2024-01-24', 'YYYY-MM-DD'), 4500.00)
 INTO Dummy_Orders VALUES(116, 15, TO_DATE('2024-01-25', 'YYYY-MM-DD'), 10.50)
 INTO Dummy_Orders VALUES(117, 16, TO_DATE('2024-01-26', 'YYYY-MM-DD'), -5.00) -- Rule Violation: Negative
 INTO Dummy_Orders VALUES(118, 17, TO_DATE('2024-01-27', 'YYYY-MM-DD'), 75.00)
 INTO Dummy_Orders VALUES(119, 88, TO_DATE('2024-01-28', 'YYYY-MM-DD'), 200.00) -- Referential Integrity: Orphan
 INTO Dummy_Orders VALUES(120, 19, TO_DATE('2024-01-29', 'YYYY-MM-DD'), 1150.00)
 INTO Dummy_Orders VALUES(121, 20, TO_DATE('2024-01-30', 'YYYY-MM-DD'), NULL) -- Rule Violation: Null
 INTO Dummy_Orders VALUES(122, 21, TO_DATE('2024-01-31', 'YYYY-MM-DD'), 670.00)
 INTO Dummy_Orders VALUES(123, 22, TO_DATE('2024-02-01', 'YYYY-MM-DD'), 45.00)
 INTO Dummy_Orders VALUES(124, 23, TO_DATE('2024-02-02', 'YYYY-MM-DD'), 890.00)
 INTO Dummy_Orders VALUES(125, 24, TO_DATE('2024-02-03', 'YYYY-MM-DD'), 105.00)
SELECT 1 FROM DUAL;


SELECT email, COUNT(*) AS Occurences
FROM Dummy_Customers 
GROUP BY email
HAVING COUNT(*) > 1;


SELECT * FROM Dummy_Orders
WHERE customer_id IS NULL
OR total_amount IS NULL;


SELECT o.order_id, o.customer_id
FROM Dummy_Orders o
LEFT JOIN Dummy_Customers c ON o.customer_id = c.customer_id WHERE c.customer_id IS NULL;


SELECT *
FROM DUMMY_ORDERS
WHERE total_amount < 0
    OR total_amount > 10000;


SELECT 'Staging' AS table_name, COUNT(*) AS row_cnt FROM Orders_Staging
UNION ALL
SELECT 'Production' AS table_name, COUNT(*) AS row_cnt FROM Orders_Production;



SELECT email
FROM Dummy_Customers
WHERE email IS NULL
   OR email NOT LIKE '%@%.com'
   AND email NOT LIKE '%@%.net'
   AND email NOT LIKE '%@%.org';


CREATE OR REPLACE PROCEDURE check_row_counts AS
    l_stage_count NUMBER;
    l_prod_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO l_stage_count FROM Orders_Staging;
    SELECT COUNT(*) INTO l_prod_count FROM Orders_Production;
    IF l_prod_count <> l_stage_count THEN
        DBMS_OUTPUT.PUT_LINE('Data Loss Alert');
    ELSE
        DBMS_OUTPUT.PUT_LINE('No Data Loss');
    END IF;
END;


CREATE OR REPLACE TRIGGER trg_standardize_country
BEFORE INSERT ON Dummy_Customers
FOR EACH ROW
BEGIN
    IF LOWER(:NEW.country) IN ('cn', 'chn', 'china') THEN
        :NEW.country := 'CN';
    END IF;
END;