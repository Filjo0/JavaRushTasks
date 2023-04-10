package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {

    static int catCount;    //статическая переменная

    public Cat() {
        Cat.catCount++;   //увеличиваем значение статический переменной на 1
    }

    public static void main(String[] args) {

    }
}
