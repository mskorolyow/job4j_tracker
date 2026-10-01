package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3");
            int matches = Integer.parseInt(scanner.nextLine());
            if (matches > count) {
                System.out.println("Вы ввели число, превосходящее остаток");
                continue;
            } else if (matches > 3) {
                System.out.println("Введите число, значение которого меньше 3х");
                continue;
            } else {
                count -= matches;
            }
            if (count == 0) {
                System.out.println(player + " поздравляем с победой!");
            } else {
                turn = !turn;
            }
            /* Остальная логика игры*/
        }
    }
}
