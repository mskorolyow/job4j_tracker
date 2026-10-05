package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус начинает движение.");
    }

    @Override
    public void beep() {
        System.out.println("На остановке маршрута дополнительно включена звуковая сигнализация.");
    }
}
