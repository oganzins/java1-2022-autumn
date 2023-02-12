# 12. Nodarbība
## Uzdevums
### Preču katalogs

**Klase Product**

Pa soļiem:
1. Izveidojam jaunu klasi **Product**:
```java
public class Product {
    
}
```
2. Izveidojam kalses laukus:
   * name - produkta nosaukums;
   * description - produkta apraksts;
   * price - produkta cena.
3. Izveidojam konstruktoru, kas saņem kā parametrus visus trīs laukus.
4. Visiem klases laukiem izveidojam **getter** un **setter** metodes.
5. Uzģenerējam **equals()** un **hashCode()** metodes (_Menu: Code -> Generate... -> equals() and hashCode()_)

**Klase ValidationException**

Pa soļiem
1. Izveidojam klasi ValidationException.
```java
public class ValidationException extends Exception {

    public ValidationException(String message) {
        super(message);
    }

}
```

**Klase DuplicateProductException**
1. Līdzīgi kā ValidationException, izveidojam klasi DuplicateProductException.
2. DuplicateProductException manto Exception klasi.
3. Klasei ir viens konstruktors, kas saņem message argument un izsauc vēcāka klases konstruktoru.

**Klase ProductNotFoundException**
1. Līdzīgi kā ValidationException, izveidojam klasi ProductNotFoundException.
2. ProductNotFoundException manto Exception klasi.
3. Klasei ir viens konstruktors, kas saņem message argument un izsauc vēcāka klases konstruktoru.


**ProductCatalog Interfeiss**

Pa soļiem:

1. Izveidojam interfeisu **ProductCatalog**:
```java
public interface ProductCatalog {

   void addProduct(Product product) throws ValidationException, DuplicateProductException;

   Collection<Product> getAllProducts();

   Product findByName(String name) throws ProductNotFoundException;

   void removeByName(String name) throws ProductNotFoundException;

}
```

**Implementācija SimpleProductCatalog**

Pa soļiem:

1. Izveidojam klasi **SimpleProductCatalog**, kas implementē **ProductCatalog** interfeisu:
```java
public class SimpleProductCatalog implements ProductCatalog {
    
   @Override
   public void addProduct(Product product) throws ValidationException, DuplicateProductException {

   }

   @Override
   public Collection<Product> getAllProducts() {
      return null;
   }

   @Override
   public Product findByName(String name) throws ProductNotFoundException {
      return null;
   }

   @Override
   public void removeByName(String name) throws ProductNotFoundException {

   }
}
```
2. Implementējam addProduct metodi:
   * Ja produkta nosaukums ir null vai "", izmetam ValidationException ar atbilstošu kļūdas ziņojumu;
   * Ja produkta nosaukums ir garāks par 50 simboliem, izmetam ValidationException ar atbilstošu kļūdas ziņojumu;
   * Ja produkta apraksts ir null vai "", izmetam ValidationException ar atbilstošu kļūdas ziņojumu;
   * Ja produkta apraksts ir garāks par 100 simboliem, izmetam ValidationException ar atbilstošu kļūdas ziņojumu;
   * Ja mēģinām pievienot produktu, kas jau reiz pieveinots (produkta unikalitāti nosaka vārds), tad izmetam DuplicateProductException.
3. Implementējam getAllProdukts metodi, kas atgriež visu pievienoto produktu kolekciju.
4. Implementējam findByName metodi:
   * Ja produkts ar šādu nosaukuma ir pievienots, tad to atgriežām.
   * Ja šāds produkts nav pievienots, tad izmetam kļūdu ProductNotFoundException.
5. Impelementējam metodi removeByName:
   * Ja produkts pēc nosaukuma ir atrasts, tad noņemam to no produktu kataloga.
   * Ja produkts pēc nosaukuma nav atrasts, tad izmetam kļūdu ProductNotFoundException.

**SimpleProductCatalog klases pārbaude**

Pa soļiem:

1. Izveidojam klasi **ProductCatalogTest**:
```java
public class ProductCatalogTest {

   public static void main(String[] args) {
      ProductCatalog productCatalog = new SimpleProductCatalog();
      Product iphone14 = new Product("Iphone 14 Pro 256GB",
              "The iPhone 14 Pro comes with a 6.1-inch ProMotion OLED display...",
              1500.55
      );

      try {
         productCatalog.addProduct(iphone14);
         System.out.println("Product added successfully: " + productCatalog.getAllProducts().contains(iphone14));
      } catch (Exception e) {
         System.out.println("Product added successfully: false");
      }

      try {
         Product product = productCatalog.findByName(iphone14.getName());
         System.out.println("Product search is successful: " + product.equals(iphone14));
      } catch (Exception e) {
         System.out.println("Product search is successful: false");
      }

      try {
         productCatalog.removeByName(iphone14.getName());
         System.out.println("Product removal is successful: " + !productCatalog.getAllProducts().contains(iphone14));
      } catch (Exception e) {
         System.out.println("Product removal is successful: false");
      }

      try {
         productCatalog.addProduct(iphone14);
         productCatalog.addProduct(iphone14);
         System.out.println("Duplicate added product validation successful: false");
      } catch (DuplicateProductException e) {
         System.out.println("Duplicate added product validation successful: true");
      } catch (Exception exception) {
         System.out.println("Duplicate added product validation successful: false");
      }

      try {
         productCatalog.findByName("Iphone 15");
         System.out.println("Non existent product search validation successful: false");
      } catch (ProductNotFoundException e) {
         System.out.println("Non existent product search validation successful: true");
      } catch (Exception exception) {
         System.out.println("Non existent product search validation successful: false");
      }

      try {
         productCatalog.findByName("Iphone 15");
         System.out.println("Non existent product search validation successful: false");
      } catch (ProductNotFoundException e) {
         System.out.println("Non existent product search validation successful: true");
      } catch (Exception exception) {
         System.out.println("Non existent product search validation successful: false");
      }

      try {
         productCatalog.removeByName("Iphone 15");
         System.out.println("Non existent product removal validation successful: false");
      } catch (ProductNotFoundException e) {
         System.out.println("Non existent product removal validation successful: true");
      } catch (Exception exception) {
         System.out.println("Non existent product removal validation successful: false");
      }

      try {
         Product nullNameProduct = new Product(null, "This is description", 10.00);
         productCatalog.addProduct(nullNameProduct);
         System.out.println("Cannot add product with null name: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with null name: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with null name: false");
      }

      try {
         Product emptyNamedProduct = new Product("", "This is description", 10.00);
         productCatalog.addProduct(emptyNamedProduct);
         System.out.println("Cannot add product with empty name: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with empty name: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with empty name: false");
      }

      try {
         Product productWithTooLongName =
                 new Product("This is a very, very, very, very, very long product name", "This is description", 10.00);
         productCatalog.addProduct(productWithTooLongName);
         System.out.println("Cannot add product with name longer than 50 characters: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with name longer than 50 characters: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with name longer than 50 characters: false");
      }

      try {
         Product productWithNullDescription =
                 new Product("Product", null, 10.00);
         productCatalog.addProduct(productWithNullDescription);
         System.out.println("Cannot add product with null description: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with null description: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with null description: false");
      }

      try {
         Product productWithEmptyDescription =
                 new Product("Product", "", 10.00);
         productCatalog.addProduct(productWithEmptyDescription);
         System.out.println("Cannot add product with empty description: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with empty description: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with empty description: false");
      }

      try {
         Product productWithTooLongDescription =
                 new Product("Product",
                         "This is a very, very, very, very, very, very, very, very, very, very, very, very, very long product description.",
                         10.00);
         productCatalog.addProduct(productWithTooLongDescription);
         System.out.println("Cannot add product with description longer than 100 characters: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with name longer than 100 characters: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with name longer than 100 characters: false");
      }

      try {
         Product productWithZeroPrice =
                 new Product("Product",
                         "This is a product description.",
                         0.00);
         productCatalog.addProduct(productWithZeroPrice);
         System.out.println("Cannot add product with zero price: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with zero price: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with zero price: false");
      }


      try {
         Product productWithNegativePrice =
                 new Product("Product",
                         "This is a product description.",
                         -10.00);
         productCatalog.addProduct(productWithNegativePrice);
         System.out.println("Cannot add product with price less than zero: false");
      } catch (ValidationException e) {
         System.out.println("Cannot add product with price less than zero: true");
      } catch (Exception e) {
         System.out.println("Cannot add product with price less than zero: false");
      }

   }
}
```
2. Izpildām **main** metodi.
3. Pārliecināmies, ka izvadītais rezultāts konsolē sakrīt ar:
```
Product added successfully: true
Product search is successful: true
Product removal is successful: true
Duplicate added product validation successful: true
Non existent product search validation successful: true
Non existent product search validation successful: true
Non existent product removal validation successful: true
Cannot add product with null name: true
Cannot add product with empty name: true
Cannot add product with name longer than 50 characters: true
Cannot add product with null description: true
Cannot add product with empty description: true
Cannot add product with name longer than 100 characters: true
Cannot add product with zero price: true
Cannot add product with price less than zero: true
```