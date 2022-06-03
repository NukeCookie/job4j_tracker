package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;

public class JobDescByPriorityTest {
    @Test
    public void whenDescByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        Assert.assertThat(rsl, lessThan(0));
    }
}