package ru.job4j.polymorphism;

/**
 * int WHEELS = 4; -- Эта запись в интерфейсе равносильна следующей записи в обычном классе:
 *                    -- public static final int WHEELS = 4;
 */

public interface Vehicle extends Fuel {
    int WHEELS = 4;

    void accelerate();

    void brake();

    void steer();

    void changGear();

    static void getDragCoefficient() {
        System.out.println("Формула расчета коэффициента аэродинамического сопротивления автомобиля");
    }

    default void chargeBattery() {
        System.out.println("Аккумулятор под капотом. Зарядить.");
    }
}
