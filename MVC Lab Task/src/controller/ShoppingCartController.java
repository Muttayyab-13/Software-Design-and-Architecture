/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author My University
 */
package controller;

import model.Item;
import model.ShoppingCart;
import view.ShoppingCartView;

public class ShoppingCartController {
    private ShoppingCart cart;
    private ShoppingCartView view;

    public ShoppingCartController(ShoppingCart cart, ShoppingCartView view) {
        this.cart = cart;
        this.view = view;
    }

    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        cart.addItem(item);
        view.displayMessage("Item added: " + name + " - $" + price);
    }

    public void displayCart() {
        view.displayCart(cart.getItems());
    }
}
