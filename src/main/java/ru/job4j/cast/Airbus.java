package ru.job4j.cast;

public class Airbus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет начинает взлет.");
    }

    @Override
    public void beep() {
        System.out.println("Слышен гул двигателей, световая сигнализация дополняет его.");
    }
}
