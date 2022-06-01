package ru.job4j.oop;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;
import ru.job4j.oop.Triangle;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertThat(rsl, Matchers.closeTo(8, 0.001));
    }

    @Test
    public void whenDoesNotExists() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertThat(rsl, Matchers.closeTo(-1, 0.001));
    }
}