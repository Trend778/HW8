package ru.skypro.HW8;

import java.time.LocalDate;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            task2(sc);
        }
    }

    private static void checkClientOs(byte clientOS, short clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Follow this link for installing app to your iOS device");
                    break;
                } else {
                    System.out.println("Follow this link for installing light version app to your iOS device");
                    break;
                }
            case 1:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Follow this link for installing app to your Android device");
                    break;
                } else {
                    System.out.println("Follow this link for installing light version app to your Android device");
                    break;
                }
        }
    }

    private static void task2(Scanner sc) {
        System.out.print("Choose the OS of your device.\nPress 0 for iOS or 1 for Android: "); //Ввод типа операционной системы
        byte clientOS = sc.nextByte();
        if (clientOS < 0 || clientOS > 1) {
            throw new RuntimeException("Выберите 0 или 1");
        }
        System.out.print("Enter the manufacture year of your device: "); //Ввод года изготовления устройства
        short clientDeviceYear = sc.nextShort();
        Scanner close;
        Main.printSeparator();
        checkClientOs(clientOS, clientDeviceYear);
        Main.printSeparator();
    }
}