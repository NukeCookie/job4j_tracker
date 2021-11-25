package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return x / a;
    }

    public int sumAllOperation(int a) {
        Calculator calculator = new Calculator();
        int c = calculator.sum(a) + calculator.multiply(a)
                + calculator.minus(a) + calculator.divide(a);
        return c;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int minusing = Calculator.minus(20);
        System.out.println(minusing);
        int dividing = calculator.minus(30);
        System.out.println(dividing);
        int alloperations = calculator.sumAllOperation(40);
        System.out.println(alloperations);
    }
}