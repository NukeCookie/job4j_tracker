package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;

public class JobAscByNameTest {
    @Test
    public void whenAscByName() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        Assert.assertThat(rsl, greaterThan(0));
    }
}
