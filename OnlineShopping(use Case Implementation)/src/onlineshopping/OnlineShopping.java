
package onlineshopping;

import onlineshopping.data.ItemRepository;
import onlineshopping.service.ShoppingService;
import onlineshopping.presentation.CustomerInterface;

public class OnlineShopping {
    public static void main(String[] args) {
        ItemRepository itemRepository = new ItemRepository();
        ShoppingService shoppingService = new ShoppingService(itemRepository);
        CustomerInterface customerInterface = new CustomerInterface(shoppingService);

        // Simulate customer browsing items
        customerInterface.browseItems("Laptop");

        // Simulate customer selecting an item for details
        customerInterface.viewItemDetails(1);
    }
}
