package ru.skypro.HW8;
import java.util.Scanner;
import java.lang.Math;

public class Third {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            task3(sc);
        }
    }

    private static int checkDeliveryDays (int deliveryDistance) {
        int days;
        if (deliveryDistance <= 20) {
            days=1;
            return days;
        } else {
            days = (int)Math.ceil (deliveryDistance /40 + 1) ;
        }
        return days;
    }
    private static void task3 (Scanner sc) {
        System.out.print("Введите расстояние от офиса до клиента: ");
        int deliveryDistance = sc.nextInt(); //Дистанция до офиса
        System.out.println("Потребуется дней: " + checkDeliveryDays(deliveryDistance)); //Кол-во дней на доставку
        Main.printSeparator();
    }
}
