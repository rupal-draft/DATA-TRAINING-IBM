import pytest

# Create a parameterized test
@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18)])
def test_transaction(wallet, earned, spent, expected):
    # Add the earned amount to wallet
    wallet += earned

    # Remove the spent amount to wallet
    wallet -= spent

    # Check final balance
    assert wallet == expected

# To create a HTML report
# pytest -v --html="Reprots/HTML_Report.html"