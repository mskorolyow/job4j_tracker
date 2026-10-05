package ru.job4j.cast;

public class CastMain {
    public static void main(String[] args) {
        Vehicle airbus = new Airbus();
        Vehicle bus = new Bus();
        Vehicle bus1 = new Bus();
        Vehicle train = new Train();
        Vehicle train1 = new Train();
        Vehicle[] vehicles = new Vehicle[] {airbus, bus, bus1, train, train1};
        for (Vehicle vehicle : vehicles) {
            vehicle.beep();
            vehicle.move();
            System.out.println(" ");
        }
    }
}
