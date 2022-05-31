package ru.job4j.pojo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        Assert.assertThat(first, Matchers.is(second));
    }
}