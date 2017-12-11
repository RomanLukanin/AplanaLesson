package ru.aplana.lesson;

import Task.Operation;

import java.util.Scanner;



public class Lesson1 {

    public static int add(int x, int y)
    {
        return (x+y);
   }
    public static void main(String[] args) {
        System.out.println("Spartak - Zenit 3:1");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а:");
        int a = in.nextInt();
        System.out.println("Введите b:");
        int b = in.nextInt();
        System.err.println("Произведение чисел: " + a*b);

       // Operation addition = new Operation("Add");
        //System.out.println("count of objects were created: " + addition.getCountOfObjects());
        //Operation subtraction = new Operation("Sub");
        //System.out.println("count of objects were created: " + addition.getCountOfObjects());
        //System.out.println("count of objects were created: " + subtraction.getCountOfObjects());
        //System.out.println("count of objects were created: " + Operation.getCountOfObjects());
        //System.out.println(addition.getOperationType());
        //System.out.println(subtraction.getOperationType());

        //int number1 = 25;
        //int number2 = 47;



//    int sum = add(number1,number2);
  //  System.out.println("add");
    }
}

