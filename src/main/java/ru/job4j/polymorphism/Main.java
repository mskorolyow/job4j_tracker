package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.changGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        System.out.println("=======");
        Vehicle sportCar = new SportCar();
        sportCar.changGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        System.out.println("=======");
        SportCar mySportCar = new SportCar();
        Vehicle vehicle = mySportCar;
        mySportCar.refill();
        System.out.println("=======");
        Vehicle.getDragCoefficient();
    }
}
