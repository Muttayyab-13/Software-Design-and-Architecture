/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author My University
 */
import model.Item;

import java.util.List;

public class ShoppingCartView {

    public void displayCart(List<Item> items) {
        System.out.println("Your Shopping Cart:");
        if (items.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
