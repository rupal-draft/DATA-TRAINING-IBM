
SET DEFINE OFF
SET SERVEROUTPUT ON

BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE Orders PURGE';
    EXECUTE IMMEDIATE 'DROP TABLE QA_Audit_Logs PURGE';
    EXECUTE IMMEDIATE 'DROP TABLE Archived_Orders PURGE';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -942 THEN
            RAISE;
        END IF;
END;
/

CREATE TABLE Orders (
    order_id     NUMBER PRIMARY KEY,
    customer_id  NUMBER,
    order_date   DATE,
    total_amount NUMBER(10, 2)
);

-- For Question 2
CREATE TABLE QA_Audit_Logs (
    error_id Number NOT NULL,
    table_name VARCHAR2(15),
    log_message VARCHAR2(35),
    log_time TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

-- For Question 3
CREATE TABLE Archived_Orders (
            order_id     NUMBER PRIMARY KEY,
            customer_id  NUMBER,
            order_date   DATE,
            total_amount NUMBER(10, 2)
        );


INSERT ALL
    INTO Orders VALUES (101,  1, TO_DATE('2024-01-10', 'YYYY-MM-DD'),   150.00)
    INTO Orders VALUES (102,  2, TO_DATE('2024-01-11', 'YYYY-MM-DD'),  2500.00)
    INTO Orders VALUES (103,  1, TO_DATE('2024-01-12', 'YYYY-MM-DD'),   -50.00) 
    INTO Orders VALUES (104,  3, TO_DATE('2024-01-13', 'YYYY-MM-DD'),      NULL) 
    INTO Orders VALUES (105, 99, TO_DATE('2024-01-14', 'YYYY-MM-DD'),   300.00) 
    INTO Orders VALUES (106,  5, TO_DATE('2024-01-15', 'YYYY-MM-DD'),   450.00)
    INTO Orders VALUES (107,  6, TO_DATE('2024-01-16', 'YYYY-MM-DD'),  1200.50)
    INTO Orders VALUES (108,  7, TO_DATE('2024-01-17', 'YYYY-MM-DD'),    89.99)
    INTO Orders VALUES (109,  8, TO_DATE('2024-01-18', 'YYYY-MM-DD'),   500.00)
    INTO Orders VALUES (110,  4, TO_DATE('2024-01-19', 'YYYY-MM-DD'), 12000.00) 
    INTO Orders VALUES (111, 10, TO_DATE('2024-01-20', 'YYYY-MM-DD'),   340.00)
    INTO Orders VALUES (112, 11, TO_DATE('2024-01-21', 'YYYY-MM-DD'),    15.00)
    INTO Orders VALUES (113, 12, TO_DATE('2024-01-22', 'YYYY-MM-DD'),   999.00)
    INTO Orders VALUES (114, 13, TO_DATE('2024-01-23', 'YYYY-MM-DD'),   250.00)
    INTO Orders VALUES (115, 14, TO_DATE('2024-01-24', 'YYYY-MM-DD'),  4500.00)
    INTO Orders VALUES (116, 15, TO_DATE('2024-01-25', 'YYYY-MM-DD'),    10.50)
    INTO Orders VALUES (117, 16, TO_DATE('2024-01-26', 'YYYY-MM-DD'),    -5.00) 
    INTO Orders VALUES (118, 17, TO_DATE('2024-01-27', 'YYYY-MM-DD'),    75.00)
    INTO Orders VALUES (119, 88, TO_DATE('2024-01-28', 'YYYY-MM-DD'),   200.00) 
    INTO Orders VALUES (120, 19, TO_DATE('2024-01-29', 'YYYY-MM-DD'),  1150.00)
    INTO Orders VALUES (121, 20, TO_DATE('2024-01-30', 'YYYY-MM-DD'),      NULL) 
    INTO Orders VALUES (122, 21, TO_DATE('2024-01-31', 'YYYY-MM-DD'),   670.00)
    INTO Orders VALUES (123, 22, TO_DATE('2024-02-01', 'YYYY-MM-DD'),    45.00)
    INTO Orders VALUES (124, 23, TO_DATE('2024-02-02', 'YYYY-MM-DD'),   890.00)
    INTO Orders VALUES (125, 24, TO_DATE('2024-02-03', 'YYYY-MM-DD'),   105.00)
SELECT 1 FROM DUAL;

-- Question 1

DECLARE
    v_order_id     Orders.order_id%TYPE     := 1001;   
    v_order_date   Orders.order_date%TYPE   := SYSDATE;
    v_total_amount Orders.total_amount%TYPE := 500;
BEGIN
    INSERT INTO Orders (order_id, order_date, total_amount)
    VALUES (v_order_id, v_order_date, v_total_amount);

    DBMS_OUTPUT.PUT_LINE('Insert succeeded for Order ID ' || v_order_id);

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Test Failed: Duplicate Order ID detected.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/

-- Question 2

BEGIN
    INSERT INTO QA_Audit_Logs 
    SELECT o.order_id, 'Orders' , 'Negative total_amount',SYSTIMESTAMP
    FROM   Orders o
    WHERE  o.total_amount < 0;  

    DBMS_OUTPUT.PUT_LINE('QA audit rows inserted: ' || SQL%ROWCOUNT);

    COMMIT;  
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('QA audit failed: ' || SQLERRM);
        ROLLBACK;  
END;
/

SELECT * FROM QA_AUDIT_LOGS;

-- Question 3

BEGIN
    INSERT INTO Archived_Orders
    SELECT * FROM Orders WHERE order_date < ADD_MONTHS(SYSDATE, -12);

    DELETE FROM Orders WHERE order_date < ADD_MONTHS(SYSDATE, -12);

    DBMS_OUTPUT.PUT_LINE('Migrated ' || SQL%ROWCOUNT || ' rows to Archived_Orders');

    COMMIT;
END;

