package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle aeroplane1 = new Aeroplane();
        Vehicle aeroplane2 = new Aeroplane();
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle[] vehicles = new Vehicle[]
                {aeroplane1, aeroplane2, bus1, bus2, train1, train2};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
