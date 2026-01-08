import pytest
from projects.shopping_cart_app import ShoppingCart

@pytest.fixture
def input_list():
    # num_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    num_list = range(11)

    return num_list

@pytest.fixture
def wallet():
    initial_amount = 0
    return initial_amount

@pytest.fixture
def cart():
    # Setup (To create the object)
    new_cart = ShoppingCart()
    yield new_cart

    # Teardown (To empty the cart before every test)
    new_cart.clear()