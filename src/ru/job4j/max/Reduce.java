package ru.job4j.max;

public class Reduce {
    private int[] sequence;

    public void to(int[] array) {
        sequence = array;
    }

    public void print() {
        for (int index = 0; index < sequence.length; index++) {
            System.out.println(sequence[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}