package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    private static int minus(int b) {
        return b - x;
    }

    public int divide(int id) {
        return id / x;
    }

    public int sumAllOperation(int t) {
        return sum(t) + multiply(t) + minus(t) + divide(t);
    }

    public static void main(String[] args) {
        int result1 = sum(10);
        Calculator calc = new Calculator();
        int result2 = calc.multiply(15);
        int result3 = minus(20);
        int result4 = calc.divide(30);
        System.out.println(result1 + result2 + result3 + result4);
        System.out.println(calc.sumAllOperation(0));
    }
}
