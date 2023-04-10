package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();
        System.setOut(consoleStream);

        //Преобразовываем записанные в наш ByteArray данные в строку
        String[] line = outputStream.toString().split("\n");
        int i = 0;
        for (String word : line) { // пока есть строки, что загнаны в наш массив
            System.out.println(word); // выводим первую строку
            // считаем счетчик второй строки
            if ((++i % 2) == 0) { // если строка третья, то выводим в консоль рекламу
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }


    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}