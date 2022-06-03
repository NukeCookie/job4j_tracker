package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;

public class JobAscByPriorityTest {
    @Test
    public void whenAscByPriority() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        Assert.assertThat(rsl, greaterThan(0));
    }
}
