package ru.job4j.ex;

import ru.job4j.ex.Fact;
import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLessThanZero() {
        new Fact().calc(-1);
    }
}