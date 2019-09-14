package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int plus = a + b;
        //напишите тут ваш код
        return plus;
    }

    public static int minus(int a, int b) {
        int minus = a - b;
        //напишите тут ваш код
        return minus;
    }

    public static int multiply(int a, int b) {
        int multiply = a * b;
        //напишите тут ваш код
        return multiply;
    }

    public static double division(int a, int b) {
        double division = (double) a / b;
        //напишите тут ваш код
        return division;
    }

    public static double percent(int a, int b) {
        double percent = a*b/100.0;
        //напишите тут ваш код
        return percent;
    }

    public static void main(String[] args) {
    }
}