import pandas as pd

employees = pd.read_csv('inputs/employees.csv')

# SELECT * FROM employees
print(employees)

# Select first_name FROM employees
print(employees['FIRST_NAME'])

# SELECT DISTINCT DEPARTMENT_ID FROM employees
print(employees['DEPARTMENT_ID'].unique())

# SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID FROM employees WHERE LAST_NAME='McEwan'
result = employees[employees['LAST_NAME'] == 'McEwen']
# print(result['FIRST_NAME'], '\n', result['LAST_NAME'], '\n', result['DEPARTMENT_ID'])

# SELECT FIRST_NAME, LAST_NAME, SALARY, DEPARTMENT_ID FROM employees WHERE FIRST_NAME LIKE 'S%';
result = employees[employees['FIRST_NAME'].str.startswith('S')]
# print(result['FIRST_NAME'], '\n', result['LAST_NAME'], '\n', result['SALARY'], '\n', result['DEPARTMENT_ID'])

# SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID FROM employees ORDER BY first_name;
result = employees.sort_values(by='FIRST_NAME', ascending=True)
print(result['FIRST_NAME'], '\n', result['LAST_NAME'], '\n', result['DEPARTMENT_ID'])

# Print the number of NaN values in each column
print(employees.isna().sum())