package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Мы едем - едем - едем...");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Количество пассажиров:" + numberOfPassengers);
    }

    @Override
    public int fill(int amountOfFuel) {
        int price = amountOfFuel * 50;
        return price;
    }
}
