import pandas as pd

# Cleaner App
def cleaner(df):
    # Drop rows with email as NaN
    df = df.dropna(subset=['email'])

    # Convert names to lowercase
    df['name'] = df['name'].str.lower()

    # Return the clean DataFrame
    return df

# Aggregrator App
def get_sales_by_city(df):
    return df.groupby('city')['amount'].sum().reset_index()

# Categorize App
def categorize_transaction(row):
    if row['amount'] > 1000:
        return 'High'
    elif row['amount'] > 500:
        return 'Medium'
    else:
        return 'Low'

def add_category_col(df):
    df['category'] = df.apply(categorize_transaction, axis=1)
    return df