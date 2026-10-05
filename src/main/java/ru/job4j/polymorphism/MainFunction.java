package ru.job4j.polymorphism;

public class MainFunction implements IFunctionOne, IFunctionTwo {

    @Override
    public double function(double x, double y) {
        return IFunctionTwo.super.function(x, y);
    }

    @Override
    public void functionMessage() {
        IFunctionOne.super.functionMessage();
    }
}
