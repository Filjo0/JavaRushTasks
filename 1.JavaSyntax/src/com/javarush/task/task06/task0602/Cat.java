package com.javarush.task.task06.task0602;

/*
Пустые кошки, пустые псы
*/

public class Cat {
    {
        System.out.println("A Cat was destroyed");

    }

    public static void main(String[] args) {
    }

    protected void finalize() throws Throwable {

    }

}

class Dog {
    {
        System.out.println("A Dog was destroyed");
    }

    protected void finalize() throws Throwable {
    }
}