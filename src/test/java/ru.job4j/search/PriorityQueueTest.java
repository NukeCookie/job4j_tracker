package ru.job4j.search;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        Assert.assertThat(result.getDesc(), Is.is("urgent"));
    }
}