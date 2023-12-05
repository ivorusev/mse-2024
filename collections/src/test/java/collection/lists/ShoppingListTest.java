package collection.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    @Test
    public void testSingleItem() {
        List<Product> products = new ArrayList<>();
        ShoppingList list = new ShoppingList(products);
        Product product = new Product("vodka", 10, 10);
        list.add(product);
        assertEquals(1, list.products().size());
        assertEquals(list.products().get(0).getName(), "vodka");
    }

}
