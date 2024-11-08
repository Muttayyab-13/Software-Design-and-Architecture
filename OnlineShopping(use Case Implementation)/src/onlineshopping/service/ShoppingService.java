// File: onlineshopping/service/ShoppingService.java
package onlineshopping.service;

import onlineshopping.data.ItemRepository;
import onlineshopping.model.Item;
import java.util.List;

public class ShoppingService {
    private ItemRepository itemRepository;

    public ShoppingService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> viewItems(String keyword) {
        return itemRepository.searchItems(keyword);
    }

    public Item viewItemDetails(int itemId) {
        return itemRepository.getItemDetails(itemId);
    }
}
