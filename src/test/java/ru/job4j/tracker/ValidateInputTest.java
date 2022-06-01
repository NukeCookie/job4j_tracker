package ru.job4j.tracker;


import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, Matchers.is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, Matchers.is(1));
    }

    @Test
    public void whenMultiValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"3", "2", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, Matchers.is(3));
        int selected2 = input.askInt("Enter menu:");
        Assert.assertThat(selected2, Matchers.is(2));
        int selected3 = input.askInt("Enter menu:");
        Assert.assertThat(selected3, Matchers.is(1));
    }

    @Test
    public void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertThat(selected, Matchers.is(-1));
    }
}