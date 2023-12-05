package collection.lists;

import java.util.*;

/**
* Represents a shopping list.
*/
public record ShoppingList(List<Product> products) {

   /**
    * Creates a new shopping list with the specified products.
    *
    * @param products the products to add to the shopping list
    */
   public ShoppingList(List<Product> products) {
       this.products = new ArrayList<>(products);
   }

   /**
    * Adds a product to the shopping list.
    *
    * @param product the product to add
    */
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

   /**
    * Finds a product in the shopping list by name.
    *
    * @param name the name of the product to find
    * @return an Optional containing the product if it was found, or an empty Optional if it was not found
    */
   private Optional<Product> findProductByName(String name) {
       return products.stream()
               .filter(product -> product.getName().equals(name))
               .findFirst();
   }

   /**
    * Gets the products in the shopping list.
    *
    * @return an unmodifiable list of the products in the shopping list
    */
   @Override
   public List<Product> products() {
       return Collections.unmodifiableList(products);
   }

   /**
    * Gets the products in the shopping list sorted by name.
    *
    * @return an unmodifiable list of the products in the shopping list sorted by name
    */
   public List<Product> getProductsSortedByName() {
       Comparator<Product> byName = Comparator.comparing(Product::getName);
       products.sort(byName);
       return Collections.unmodifiableList(products);
   }
}