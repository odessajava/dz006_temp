package com.company;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {

        task_3();

    }


    private static int checkInt() {
        int number;
        while (!scannerInt.hasNextInt()) {
            System.out.println("Введите целое число!");
            scannerInt.next();
        }
        number = scannerInt.nextInt();
        return number;
    }

    private static void task_3(){
        int num=0;
        boolean simpleInt=false;

        System.out.println("Введите целое число до 100");
        num=checkInt();
        System.out.println(num);
        simpleInt=PrimeNumber.simple(num);
    }
}