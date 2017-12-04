package ru.aplana.lesson;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Spartak - Zenit 3:1");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а:");
        int a = in.nextInt();
        System.out.println("Введите b:");
        int b = in.nextInt();
        System.err.println("Произведение чисел: " + a*b);
    }
}
