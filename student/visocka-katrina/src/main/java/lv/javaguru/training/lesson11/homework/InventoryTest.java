package lv.javaguru.training.lesson11.homework;

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
