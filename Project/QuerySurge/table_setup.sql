-- To reset
DROP TABLE STG_CUSTOMERS;
DROP TABLE DIM_CUSTOMERS;

-- To create the staging table
CREATE TABLE STG_CUSTOMERS (
    CustomerID INT PRIMARY KEY,
    FullName VARCHAR(100),
    Email VARCHAR(100),
    SignupDate DATE,
    Status VARCHAR(1) -- 'A' for Active, 'I' for Inactive
);

-- To create the target table
CREATE TABLE DIM_CUSTOMERS (
    CUST_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    EMAIL_ADDR VARCHAR(100),
    IS_ACTIVE INT, -- 1 for Active, 0 for Inactive
    LOAD_DATE DATE
);

-- Adding data to the STG_CUSTOMERS
INSERT INTO STG_CUSTOMERS VALUES 
(101, 'John Doe', 'john.d@example.com', TO_DATE('2023-01-15', 'YYYY-MM-DD'), 'A'),
(102, 'Jane Smith', 'jane.s@example.com', TO_DATE('2023-02-20', 'YYYY-MM-DD'), 'A'),
(103, 'Bob Brown', NULL, TO_DATE('2023-03-05', 'YYYY-MM-DD'), 'I'),
(104, 'Alice White', 'alice.w@test.com', TO_DATE('2023-04-10', 'YYYY-MM-DD'), 'A'),
(105, 'Charlie Green', 'char.g@web.com', TO_DATE('2023-05-12', 'YYYY-MM-DD'), 'A'),
(106, 'David Black', 'd.black@provider.com', TO_DATE('2023-06-18', 'YYYY-MM-DD'), 'I'),
(107, 'Eve Adams', 'eve.a@site.com', TO_DATE('2023-07-22', 'YYYY-MM-DD'), 'A'),
(108, 'Frank Miller', 'f.miller@mail.com', TO_DATE('2023-08-30', 'YYYY-MM-DD'), 'A'),
(109, 'Grace Hopper', 'ghopper@tech.com', TO_DATE('2023-09-05', 'YYYY-MM-DD'), 'I'),
(110, 'Hank Williams', 'hank.w@music.com', TO_DATE('2023-10-12', 'YYYY-MM-DD'), 'A');

-- Adding data to the DIM_CUSTOMERS
INSERT INTO DIM_CUSTOMERS VALUES 
(101, 'John', 'Doe', 'john.d@example.com', 1, TO_DATE('2023-01-16', 'YYYY-MM-DD')),
(102, 'Jane', 'Smith', 'jane.s@example.com', 1, TO_DATE('2023-02-21', 'YYYY-MM-DD')),
(103, 'Bob', 'Brown', 'missing@corp.com', 0, TO_DATE('2023-03-06', 'YYYY-MM-DD')), -- BUG: NULL should be NULL or 'missing'
(104, 'Alice', 'White', 'alice.w@test.com', 1, TO_DATE('2023-04-11', 'YYYY-MM-DD')),
(105, 'Charlie', 'Green', 'char.g@web.com', 1, TO_DATE('2023-05-13', 'YYYY-MM-DD')),
(106, 'David', 'Black', 'd.black@provider.com', 0, TO_DATE('2023-06-19', 'YYYY-MM-DD')),
(107, 'Eve', 'Adams', 'eve.a@site.com', 1, TO_DATE('2023-07-23', 'YYYY-MM-DD')),
(108, 'Frank', 'Miller', 'f.miller@mail.com', 1, TO_DATE('2023-08-31', 'YYYY-MM-DD')),
(109, 'Grace', 'Hopper', 'ghopper@tech.com', 1, TO_DATE('2023-09-06', 'YYYY-MM-DD')), -- BUG: Should be 0 (Inactive)
(110, 'Hank', 'Williams', 'hank.w@music.com', 1, TO_DATE('2023-10-13', 'YYYY-MM-DD'));