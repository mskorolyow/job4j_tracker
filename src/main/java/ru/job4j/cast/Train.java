package ru.job4j.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Поезд начинает движение.");
    }

    @Override
    public void beep() {
        System.out.println("Поезд подает сигнал о начале движения.");
    }
}
