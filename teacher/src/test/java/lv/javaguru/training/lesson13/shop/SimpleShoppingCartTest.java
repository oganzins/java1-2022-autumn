package lv.javaguru.training.lesson13.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SimpleShoppingCartTest {

    private static final Product BREAD = new Product("Maize", 1.85);
    private static final Product BUTTER = new Product("Sviests", 2.50);

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp() {
        shoppingCart = new SimpleShoppingCart();
    }

    @Test
    public void shouldNotAddProductWithoutName() {
        Assertions.assertThrows(NullPointerException.class,
                () -> shoppingCart.add(null, 5.35)
        );
    }

    @Test
    public void shouldNotAddProductWithEmptyName() {
        Assertions.assertThrows(ProductNameCannotBeEmpty.class,
                () -> shoppingCart.add("", 3.39)
        );
    }


    @Test
    public void shouldAddProduct() {
        shoppingCart.add(BREAD);

        List<Product> products = shoppingCart.getProducts();

        Assertions.assertTrue(products.contains(BREAD));
    }

    @Test
    public void shouldCreateAndAddProduct() {
        shoppingCart.add("Piens", 1.40);

        List<Product> products = shoppingCart.getProducts();
        Product milk = new Product("Piens", 1.40);

        Assertions.assertTrue(products.contains(milk));
    }

    @Test
    public void shouldRemoveProduct() {
        shoppingCart.add(BREAD);
        shoppingCart.removeProduct(BREAD);

        List<Product> products = shoppingCart.getProducts();

        Assertions.assertTrue(products.isEmpty());
    }

    @Test
    public void shouldRemoveAllProducts() {
        shoppingCart.add(BREAD);
        shoppingCart.add(BREAD);
        shoppingCart.add(BREAD);

        shoppingCart.removeProduct(BREAD);

        List<Product> products = shoppingCart.getProducts();

        Assertions.assertTrue(products.isEmpty());
    }

    @Test
    public void shouldRemoveProductByName() {
        shoppingCart.add(BREAD);
        shoppingCart.removeProduct(BREAD.getName());

        List<Product> products = shoppingCart.getProducts();

        Assertions.assertTrue(products.isEmpty());
    }

    @Test
    public void shouldReturnAllProducts() {
        shoppingCart.add(BREAD);
        shoppingCart.add(BUTTER);

        List<Product> products = shoppingCart.getProducts();

        Assertions.assertEquals(2, products.size());
        Assertions.assertTrue(products.contains(BREAD));
        Assertions.assertTrue(products.contains(BUTTER));
    }

    @Test
    public void shouldCalculateTotal() {
        shoppingCart.add(BREAD);
        shoppingCart.add(BREAD);
        shoppingCart.add(BUTTER);

        double result = shoppingCart.getTotal();

        Assertions.assertEquals(6.20, result);
    }

}