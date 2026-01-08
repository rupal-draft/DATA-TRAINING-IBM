import pandas as pd
import numpy as np
import pytest
from projects.pandas_app import cleaner, get_sales_by_city, add_category_col
from pandas.testing import assert_frame_equal

# Cleaner App Tests
@pytest.fixture
def dirty_df():
    return pd.DataFrame({
        'name': ['ALICE', 'Bob', 'CHArliE'],
        'email': ['a@email.com', None, 'c@email.com']
    })

def test_clean_data(dirty_df):
    clean_df = cleaner(dirty_df)

    # Assertions
    assert len(clean_df) == 2
    assert clean_df['name'][0] == 'alice'
#==========================================================

# Aggregator App Tests
def test_sales_by_city():
    input_df = pd.DataFrame({
        "city": ["NY", "NY", "SF", "SF"],
        "amount": [10, 20, 20, 5]
    })
    expected_df = pd.DataFrame({
        "city": ["NY", "SF"],
        "amount": [30, 25]
    })

    result = get_sales_by_city(input_df)
    assert_frame_equal(result, expected_df)

@pytest.mark.parametrize("input_data, expected_data", [
    (
        {"city": ["London"], "amount": [500]},
        {"city": ["London"], "amount": [500]}
    ),
    (
        {"city": ["London", "London"], "amount": [500, 50]},
        {"city": ["London"], "amount": [550]}
    ),
    (
        {"city": ["London", "Chicago"], "amount": [500, 50]},
        {"city": ["Chicago", "London"], "amount": [50, 500]}
    ),
    (
        {"city": ["Hamburg", "Hamburg"], "amount": [50.5, 80]},
        {"city": ["Hamburg"], "amount": [130.5]}
    )
])
def test_variations(input_data, expected_data):
    # Create the input and expected DataFrames
    input = pd.DataFrame(input_data)
    expected = pd.DataFrame(expected_data)

    output = get_sales_by_city(input)
    assert_frame_equal(output, expected)

#==========================================================

# Categorize App Tests
@pytest.mark.parametrize("amount, expected_category", [
    (1500, "High"),
    (800, "Medium"),
    (100, "Low"),
    (500, "Low"),
    (1000, "Medium")
])
def test_categories(amount, expected_category):
    # Create the input DataFrame
    input = pd.DataFrame({"amount": [amount]})
    output = add_category_col(input)

    # Assertions
    assert output["category"][0] == expected_category

def test_category_empty_df():
    input = pd.DataFrame(columns=['amount'])
    output = add_category_col(input)

    # Assertions
    assert output.empty # Empty DataFrame
    assert 'category' in output.columns # Category column is created

def test_category_nan_values():
    input = pd.DataFrame({"amount": [np.nan, None]}) # NaN
    output = add_category_col(input)

    # Assertions
    assert output["category"][0] == "Low"
    assert output["category"][1] == "Low"