# MVC Pattern Example: Shopping Cart
This project demonstrates a simple implementation of the Model-View-Controller (MVC) design pattern using a Shopping Cart use case. The MVC pattern separates the application logic into three interconnected components, improving maintainability and scalability.

# Project Overview
This application allows users to:

Add items to a shopping cart.
View the contents of the cart.
The project is divided into:

# Model: 
Manages the application's data and business logic.
# View: 
Displays data to the user.
# Controller:
Handles user input and updates the Model and View.
Project Structure

 # Components
Model:
Item: Represents an item with a name and price.
ShoppingCart: Manages a list of items.
View:
ShoppingCartView: Displays information to the user.
Controller:
ShoppingCartController: Manages user input and updates the Model and View.
# Features
Add items to the shopping cart.
View the current items in the shopping cart.
Demonstrates clear separation of concerns using MVC principles.
# Installation
Clone the Repository
git clone: https://github.com/username/mvc-shopping-cart.git

# Usage
Run the program to start the shopping cart application.
Use the menu options to:
Add items to the cart by entering the item name and price.
View the items currently in your cart.

## Sample Output

Shopping Cart Menu:
1. Add Item
2. View Cart
3. Exit
Enter your choice: 1
Enter item name: Laptop
Enter item price: 1200.00
Item added: Laptop - $1200.00

Shopping Cart Menu:
1. Add Item
2. View Cart
3. Exit
Enter your choice: 2
Your Shopping Cart:
Laptop - $1200.00
Technologies Used
Java: Core programming language.


# License
This project is licensed under the MIT License. See the LICENSE file for details.
