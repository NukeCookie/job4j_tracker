package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();
        int lengthOfArray = Math.min(leftArray.length, rightArray.length);
        for (int i = 0; i < lengthOfArray; i++) {
            if (leftArray[i] != rightArray[i]) {
                return leftArray[i] - rightArray[i];
            }
        }
        return leftArray.length - rightArray.length;
    }
}