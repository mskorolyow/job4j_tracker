package ru.job4j.polymorphism;

public interface ITransport {
    void move();

    void passengers(int count);

    int refuel(int fuel);
}
