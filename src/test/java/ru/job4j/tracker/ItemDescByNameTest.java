package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemDescByNameTest {

    @Test
    public void whenDescByName() {
        List<Item> items = Arrays.asList(
                new Item(2, "second"),
                new Item(1, "first"),
                new Item(3, "third")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "third"),
                new Item(2, "second"),
                new Item(1, "first")
        );
        Assert.assertThat(items, Is.is(expected));
    }
}