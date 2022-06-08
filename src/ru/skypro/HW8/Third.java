package ru.skypro.HW8;
import java.util.Scanner;
import java.lang.Math;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task3(sc);
    }

    static void checkDelivery (int deliveryDistance) {
        int days;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else {
            days = (int)Math.ceil (deliveryDistance /40 + 1) ;
            System.out.println("Потребуется дней: " + days);
        }
    }
    public static void task3 (Scanner sc) {
        System.out.print("Введите расстояние от офиса до клиента: ");
        int deliveryDistance = sc.nextInt(); //Дистанция до офиса
        checkDelivery(deliveryDistance);
        Main.printSeparator();
    }
}
