// File: onlineshopping/data/ItemRepository.java
package onlineshopping.data;

import onlineshopping.model.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private List<Item> items;

    public ItemRepository() {
        items = new ArrayList<>();
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
