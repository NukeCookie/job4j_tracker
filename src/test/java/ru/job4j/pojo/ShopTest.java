package ru.job4j.pojo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.pojo.Product;
import ru.job4j.pojo.Shop;

public class ShopTest {
    @Test
    public void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        Assert.assertThat(rsl, Matchers.is(3));
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        Assert.assertThat(rsl, Matchers.is(0));
    }

    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        Assert.assertThat(rsl, Matchers.is(-1));
    }
}