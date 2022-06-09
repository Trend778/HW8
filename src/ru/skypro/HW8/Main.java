package ru.skypro.HW8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            task1(sc);
        }
    }

    public static void printSeparator() {                       //пробелы
        System.out.println("********************");
    }

    private static void printYear(int year) {                            //проверка года
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }
    }

    private static void task1(Scanner sc) {                             //задание 1
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        printYear(year);
        printSeparator();
    }

}
