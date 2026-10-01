package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великая консоль. Задавай свой вопрос!");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        String result = "Твой вопрос звучал следующим образом: " + question + " отвечаю: ";
        if (answer == 0) {
            result += "Да";
        } else if (answer == 1) {
            result += "Нет";
        } else {
            result += "Может быть!";
        }
        System.out.println(result);
    }
}
