package lv.javaguru.training.homework12;

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
