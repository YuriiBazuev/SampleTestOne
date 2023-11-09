package Discount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // ввод данных через сканер
        System.out.print("Введите количество баллов: ");
        int points = scanner.nextInt(); // ввод тестовых данных
        Discount discount = new Discount();
        double discountPercentage = discount.calculation(points);
        System.out.println("Процент скидки: " + discountPercentage + "%");
        }
        }

