package ru.job4j.pojo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ShopDropTest {
    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 0);
        Assert.assertThat(rsl[0].getName(), Matchers.is("Bread"));
        Assert.assertThat(rsl[1], Matchers.is(Matchers.nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 1);
        Assert.assertThat(rsl[0].getName(), Matchers.is("Milk"));
        Assert.assertThat(rsl[1], Matchers.is(Matchers.nullValue()));
    }

    @Test
    public void whenArrayLengthIs4AndDeleteElementWithIndex1() {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        int index = 1;
        Product[] rsl = ShopDrop.delete(products, index);
        Assert.assertThat(rsl[index].getName(), Matchers.is("Milk"));
        Assert.assertThat(rsl[2].getName(), Matchers.is("Fish"));
        Assert.assertThat(rsl[products.length - 1], Matchers.is(Matchers.nullValue()));
    }

    @Test
    public void whenArrayLengthIs5AndDeleteElementWithIndex2() {
        Product[] products = new Product[5];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        int index = 2;
        Product[] rsl = ShopDrop.delete(products, index);
        Assert.assertThat(rsl[1].getName(), Matchers.is("Egg"));
        Assert.assertThat(rsl[index].getName(), Matchers.is("Fish"));
        Assert.assertThat(rsl[3].getName(), Matchers.is("Fruit"));
        Assert.assertThat(rsl[products.length - 1], Matchers.is(Matchers.nullValue()));
    }
}