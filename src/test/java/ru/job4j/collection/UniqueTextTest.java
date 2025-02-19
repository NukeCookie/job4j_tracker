package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.UniqueText;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats milk and a mouse";
        Assert.assertThat(UniqueText.isEquals(origin, text), Is.is(true));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        Assert.assertThat(UniqueText.isEquals(origin, text), Is.is(false));
    }
}