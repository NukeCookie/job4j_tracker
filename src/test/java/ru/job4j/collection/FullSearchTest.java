package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.FullSearch;
import ru.job4j.collection.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        Assert.assertThat(FullSearch.extractNumber(tasks), Is.is(expected));
    }
}