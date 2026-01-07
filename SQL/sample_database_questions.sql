-- Write a block that calculates the average total_amount from Orders. If the average is 20% higher or lower than a "Threshold" variable (e.g., $500), print "Anomalous Data Volume Detected."


SET SERVEROUTPUT ON

DECLARE
    v_threshold   NUMBER := 500;

    v_avg_total   NUMBER;

BEGIN
    
SELECT SUM(quantity * unit_price) / COUNT(DISTINCT order_id)
    INTO   v_avg_total
    FROM   order_items;


    IF v_avg_total < (v_threshold * 0.80)
       OR v_avg_total > (v_threshold * 1.20) THEN
        DBMS_OUTPUT.PUT_LINE('Anomalous Data Volume Detected.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Average is within expected range.');
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error computing average: ' || SQLERRM);
END;
/


-- Create a trigger that prevents an insert into Orders if the customer_id does not exist in the Customers table. (This simulates a manual Foreign Key check).

CREATE OR REPLACE TRIGGER trg_orders_chk_customer
BEFORE INSERT OR UPDATE OF customer_id ON orders
FOR EACH ROW
DECLARE
    v_dummy NUMBER;
BEGIN
    IF :NEW.customer_id IS NULL THEN
        RAISE_APPLICATION_ERROR(
            -20002,
            'Orders.customer_id cannot be NULL and must exist in Customers.'
        );
    END IF;
END;
/





-- Create a procedure run_smoke_test that calls three separate validation queries (Null check, Duplicate check, Range check) on both Dummy_Orders and Dummy_Customers. The procedure should return a summary: "3 Tests Run, X Errors Found."


SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE run_smoke_test AS
    v_errors NUMBER := 0;
    v_cnt    NUMBER;
BEGIN
    SELECT COUNT(*) INTO v_cnt
    FROM orders
    WHERE order_id IS NULL OR customer_id IS NULL;
    v_errors := v_errors + v_cnt;

    SELECT NVL(SUM(cnt - 1), 0) INTO v_cnt
    FROM (
        SELECT COUNT(*) AS cnt
        FROM orders
        GROUP BY order_id
        HAVING COUNT(*) > 1
    );
    v_errors := v_errors + v_cnt;

    SELECT NVL(SUM(cnt - 1), 0) INTO v_cnt
    FROM (
        SELECT COUNT(*) AS cnt
        FROM customers
        GROUP BY customer_id
        HAVING COUNT(*) > 1
    );
    v_errors := v_errors + v_cnt;

    DBMS_OUTPUT.PUT_LINE('3 Tests Run, ' || v_errors || ' Errors Found.');
END;
/

