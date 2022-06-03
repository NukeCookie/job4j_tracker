package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobDescByNameTest {

    @Test
    public void whenDescByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}