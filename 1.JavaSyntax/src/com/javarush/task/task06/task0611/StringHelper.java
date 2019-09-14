package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int i;
        for (i = 0; i < 5; i++) {
            result += s;
        }

        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int a;
        for (a = 0; a < count; a++) {
            result += s;
        }
        //напишите тут ваш код
        return result;
    }

    public static void main(String[] args) {

    }
}
