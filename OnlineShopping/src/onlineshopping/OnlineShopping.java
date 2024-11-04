/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlineshopping;

import java.util.ArrayList;
import java.util.List;

// Item class to represent an item in the database
class Item {
    private int id;
    private String name;
    private String description;

    public Item(int id, String name, String description) {
        this.id = id;
        this.name = name;
        
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Name: " + name + ", Description: " + description;
    }
}

// ItemDatabase class that stores items and allows search/filter
class ItemDatabase {
    private List<Item> items;

    public ItemDatabase() {
        items = new ArrayList<>();
        // Initialize with some sample items
        items.add(new Item(1, "Laptop", "High performance laptop"));
        items.add(new Item(2, "Smartphone", "Latest model smartphone"));
        items.add(new Item(3, "Headphones", "Noise-cancelling headphones"));
    }

    public List<Item> searchItems(String keyword) {
        List<Item> results = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }

    public Item getItemDetails(int itemId) {
        for (Item item : items) {
            if (item.getId() == itemId) {
                return item;
            }
        }
        return null;
    }
}

// OnlineShoppingSystem class that handles the view items process
class OnlineShoppingSystem {
    private ItemDatabase itemDatabase;

    public OnlineShoppingSystem(ItemDatabase itemDatabase) {
        this.itemDatabase = itemDatabase;
    }

    public List<Item> viewItems(String keyword) {
        return itemDatabase.searchItems(keyword);
    }

    public Item viewItemDetails(int itemId) {
        return itemDatabase.getItemDetails(itemId);
    }
}

// Customer class representing a customer interaction
class Customer {
    private OnlineShoppingSystem shoppingSystem;

    public Customer(OnlineShoppingSystem shoppingSystem) {
        this.shoppingSystem = shoppingSystem;
    }

    public void browseItems(String keyword) {
        System.out.println("Displaying list of items based on keyword: " + keyword);
        List<Item> items = shoppingSystem.viewItems(keyword);
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void viewItemDetails(int itemId) {
        System.out.println("Displaying details for item ID: " + itemId);
        Item item = shoppingSystem.viewItemDetails(itemId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found.");
        }
    }
}

// Main class to simulate the interaction
public class OnlineShopping {
    public static void main(String[] args) {
        ItemDatabase itemDatabase = new ItemDatabase();
        OnlineShoppingSystem shoppingSystem = new OnlineShoppingSystem(itemDatabase);
        Customer customer = new Customer(shoppingSystem);

        // Simulate customer browsing items
        customer.browseItems("Laptop");

        // Simulate customer selecting an item for details
        customer.viewItemDetails(1);
    }
}
