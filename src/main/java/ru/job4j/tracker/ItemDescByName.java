package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        List<String> list = Arrays.asList(first.getName(), second.getName());
        return second.getName().compareTo(first.getName());
        }
    }