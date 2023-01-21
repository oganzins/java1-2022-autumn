# 11. Nodarbība
## Uzdevums
### Preču uzskaite

**Klase Product**

Pa soļiem:
1. Izveidojam jaunu klasi **Product**:
```java
public class Product {
    
}
```
2. Izveidojam kalses laukus:
   * name - produkta nosaukums;
   * price - produkta cena;
   * quanity - produkta daudzums.
2. Visiem klases laukiem izveidojam **getter** un **setter** metodes.
3. Uzģenerējam **equals()** un **hashCode()** metodes (_Menu: Code -> Generate... -> equals() and hashCode()_)


**Inentory Interfeiss**

Pa soļiem:

1. Izveidojam interfeisu **Inentory**:
```java
public interface Inventory {

   void addProduct(Product product);

   Product getProduct(String productName);

   int getProductCount();

   List<Product> getAllProducts();

   int getProductQuantity(String productName);

   void updateProductQuantity(String productName, int newQuantity);

   double getProductPrice(String productName);

   void updateProductPrice(String productName, double newPrice);

   Product getProductWithLowestPrice();

   Product getProductWithHighestPrice();

   void removeProduct(String productName);

}
```

**SimpleInventory Implementācija**

Pa soļiem:

1. Izveidojam klasi **SimpleInentory**, kas implementē **Inventory** interfeisu:
```java
public class SimpleInventory implements Inventory {

   private Map<String, Product> products;

   public SimpleInventory() {
      products = new HashMap<>();
   }
   
   @Override
   public void addProduct(Product product) {

   }

   @Override
   public Product getProduct(String productName) {
      return null;
   }

   @Override
   public int getProductCount() {
      return 0;
   }

   @Override
   public List<Product> getAllProducts() {
      return null;
   }

   @Override
   public int getProductQuantity(String productName) {
      return 0;
   }

   @Override
   public void updateProductQuantity(String productName, int newQuantity) {

   }

   @Override
   public double getProductPrice(String productName) {
      return 0;
   }

   @Override
   public void updateProductPrice(String productName, double newPrice) {

   }

   @Override
   public Product getProductWithLowestPrice() {
      return null;
   }

   @Override
   public Product getProductWithHighestPrice() {
      return null;
   }

   @Override
   public void removeProduct(String productName) {

   }
}
```
2. Implementējam korekti visas interfeisa metodes:
   * addProduct(product) - pievieno produktu noliktavai (produkta nosaukums kalpo kā atslēga Map klasei);
   * getProduct(productName) - atgriež produktu pēc nosaukuma;
   * getProductCount() - atgriež unikālo produktu skaitu;
   * getAllProducts() - atgriež visu noliktavas produktu sarakstu;
   * getProductQuanity(productName) - atgriež produkta vienību skaitu;
   * updateProductQuantity(productName, newQuantity) - uzstāda jauno produkta vienību atlikumu;
   * getProductPrice(productName) - atgriež produkta cenu;
   * updateProductPrice(productName, newPrice) - uzstāda jauno produkta cenu;
   * getProductWithLowestPrice() - atgriež lētāko produktu;
   * getProductWithHighestPrice() - atgriež dargāko produktu;
   * removeProduct(productName) - izņem produktu no noliktavas

**MyBookShelf klases pārbaude**

Pa soļiem:

1. Izveidojam klasi **InventoryTest**:
```java
public class InventoryTest {

   public static void main(String[] args) {
      Product appleIphone = new Product("Apple Iphone 14", 1200.0, 100);

      Inventory inventory = new SimpleInventory();

      System.out.println("Product inventory is empty after creation: " + (inventory.getProductCount() == 0));

      inventory.addProduct(appleIphone);

      System.out.println("Product inventory is 1 after one product added: " + (inventory.getProductCount() == 1));

      Product retrievedProduct = inventory.getProduct("Apple Iphone 14");

      System.out.println("Retrieved product matches added product: " + retrievedProduct.equals(appleIphone));
      System.out.println("Product inventory is 1 before adding next product: " + (inventory.getProductCount() == 1));

      Product samsungFold = new Product("Samsung Galaxy Fold 4", 2111.34, 50);
      inventory.addProduct(samsungFold);

      System.out.println("Product inventory is 2 after one product added: " + (inventory.getProductCount() == 2));

      Product sonyXperia = new Product("Sony Xperia 1 IV", 1429, 500);
      inventory.addProduct(sonyXperia);

      System.out.println("Product inventory is 3 after one product added: " + (inventory.getProductCount() == 3));

      Product huaweiNova = new Product("Huawei nova 10", 499, 5);
      inventory.addProduct(huaweiNova);

      System.out.println("Product inventory is 4 after adding next product: " + (inventory.getProductCount() == 4));
      System.out.println("Product quantity of last added product is 5: " + (inventory.getProductQuantity("Huawei nova 10") == 5));
      System.out.println("Product price of last added product is 499: " + (inventory.getProductPrice("Huawei nova 10") == 499));

      Product copyHuaweiNova = new Product("Huawei nova 10", 499, 5);
      inventory.addProduct(copyHuaweiNova);

      System.out.println("Product inventory is 4 after trying to add existing product: " + (inventory.getProductCount() == 4));

      inventory.updateProductPrice("Huawei nova 10", 510);

      System.out.println("Product price of last added product now is 510: " + (inventory.getProductPrice("Huawei nova 10") == 510));

      inventory.updateProductQuantity("Huawei nova 10", 100);

      System.out.println("Product quantity of last added product now is 100: " + (inventory.getProductQuantity("Huawei nova 10") == 100));
      System.out.println("Product with lowest price is Huawei nova 10: " + inventory.getProductWithLowestPrice().getName().equals("Huawei nova 10"));
      System.out.println("Product with highest price is Samsung Galaxy Fold 4: " + inventory.getProductWithHighestPrice().getName().equals("Samsung Galaxy Fold 4"));

      inventory.removeProduct("Huawei nova 10");

      System.out.println("Product Huawei nova 10 is removed successfully: " + (inventory.getProduct("Huawei nova 10") == null));
   }

}
```
2. Izpildām **main** metodi.
3. Pārliecināmies, ka izvadītais rezultāts konsolē sakrīt ar:
```
Product inventory is empty after creation: true
Product inventory is 1 after one product added: true
Retrieved product matches added product: true
Product inventory is 1 before adding next product: true
Product inventory is 2 after one product added: true
Product inventory is 3 after one product added: true
Product inventory is 4 after adding next product: true
Product quantity of last added product is 5: true
Product price of last added product is 499: true
Product inventory is 4 after trying to add existing product: true
Product price of last added product now is 510: true
Product quantity of last added product now is 100: true
Product with lowest price is Huawei nova 10: true
Product with highest price is Samsung Galaxy Fold 4: true
Product Huawei nova 10 is removed successfully: true
```