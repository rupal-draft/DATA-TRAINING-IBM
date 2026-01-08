# Create 4 test functions
# Add: Sum should be 10
# Subtract: Difference should be 25
# Mulitply: Product should be 100
# Divide: Quotient should be 5
# Mark all 4 functions with "activity"
# Run the tests using the custom marker
import pytest

@pytest.mark.activity
def test_add():
    num1 = 5
    num2 = 5

    assert num1+num2 == 10

@pytest.mark.activity
def test_subtract():
    num1 = 50
    num2 = 25

    assert num1-num2 == 25

@pytest.mark.activity
def test_mulitply():
    num1 = 25
    num2 = 4

    assert num1*num2 == 100

@pytest.mark.activity
def test_add():
    num1 = 25
    num2 = 5

    assert num1//num2 == 5
