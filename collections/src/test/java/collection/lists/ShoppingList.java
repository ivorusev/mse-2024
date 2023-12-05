package collection.lists;

import java.util.*;

public class ShoppingList {

    private List<Product> products;
    public ShoppingList(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public void add(Product product) {
        Optional<Product> productByName = findProductByName(product.getName());
        if (productByName.isPresent()) {
            Product existingProduct = productByName.get();
            int newQuantity = existingProduct.getQuantity() + product.getQuantity();
            existingProduct.setQuantity(newQuantity);
            return;
        }
        products.add(product);
    }

    private Optional<Product> findProductByName(String name) {
        return products.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst();
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public List<Product> getProductsSortedByName() {
        Comparator<Product> byName = Comparator.comparing(Product::getName);
        products.sort(byName);
        return Collections.unmodifiableList(products);
    }
}
