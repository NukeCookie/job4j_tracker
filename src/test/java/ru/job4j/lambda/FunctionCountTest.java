package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.core.Is;
import org.junit.Assert;

public class FunctionCountTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        Assert.assertThat(result, Is.is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x ->
                2 * Math.pow(x, 2) + x + 3);
        List<Double> expected = Arrays.asList(58D, 81D, 108D);
        Assert.assertThat(result, Is.is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x ->
                Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        Assert.assertThat(result, Is.is(expected));
    }
}