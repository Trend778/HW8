package ru.skypro.HW8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1(sc);
    }

    public static void printSeparator() {                       //пробелы
        System.out.println("********************");
    }

    public static void isLeapYear(int year) {                            //проверка года
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }
    }

    public static void task1(Scanner sc) {                             //задание 1
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        Scanner close;
        isLeapYear(year);
        printSeparator();
    }

}
