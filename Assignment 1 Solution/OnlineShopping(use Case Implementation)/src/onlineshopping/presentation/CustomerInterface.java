// File: onlineshopping/presentation/CustomerInterface.java
package onlineshopping.presentation;

import onlineshopping.service.ShoppingService;
import onlineshopping.model.Item;
import java.util.List;

public class CustomerInterface {
    private ShoppingService shoppingService;

    public CustomerInterface(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    public void browseItems(String keyword) {
        System.out.println("Displaying list of items based on keyword: " + keyword);
        List<Item> items = shoppingService.viewItems(keyword);
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void viewItemDetails(int itemId) {
        System.out.println("Displaying details for item ID: " + itemId);
        Item item = shoppingService.viewItemDetails(itemId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found.");
        }
    }
}
