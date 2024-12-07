/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc.lab.task;

/**
 *
 * @author My University
 */
import controller.ShoppingCartController;
import model.ShoppingCart;
import view.ShoppingCartView;

import java.util.Scanner;

public class MVCLabTask {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        ShoppingCartView view = new ShoppingCartView();
        ShoppingCartController controller = new ShoppingCartController(cart, view);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    controller.addItem(name, price);
                    break;
                case 2:
                    controller.displayCart();
                    break;
                case 3:
                    System.out.println("Exiting Shopping Cart. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

