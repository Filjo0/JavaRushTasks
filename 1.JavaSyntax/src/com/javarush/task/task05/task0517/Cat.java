package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    private String name = null;
    private int age = 5;
    private int weight = 5;
    private String color = "Black";
    private String address = null;

    public Cat(String name) {

        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}