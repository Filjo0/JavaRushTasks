package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {

    String name;

    Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
    }

    protected void finalize() throws Throwable {

    }
}
