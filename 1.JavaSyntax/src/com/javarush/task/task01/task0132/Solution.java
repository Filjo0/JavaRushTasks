package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(333));
    }

    public static int sumDigitsInNumber(int number) {
     int a = number/100;
     int b = number%100;
     int c = b/10;//напишите тут ваш код
        int d = b%10;
                return a + c + d;
    }
}