package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.Order;
import ru.job4j.collection.OrderConvert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        Assert.assertThat(map.get("3sfe"), Is.is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenDuplicatedOrder() {
        List<Order> ordersWere = Arrays.asList(
                new Order("3sfe", "Dress"),
                new Order("3ssr", "Trousers"),
                new Order("3sfe", "Skirt")
        );
        HashMap<String, Order> ordersNow = OrderConvert.process(ordersWere);
        Assert.assertTrue(ordersNow.size() < ordersWere.size());
    }
}
