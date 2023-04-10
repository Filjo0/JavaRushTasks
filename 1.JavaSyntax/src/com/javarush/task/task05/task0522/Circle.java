package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;
    int g, i;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(double x) {
        this.x = x;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, int g) {
        this.x = x;
        this.y = y;
        this.g = g;
    }

    public Circle(double x, double y, int g, int i) {
        this.x = x;
        this.y = y;
        this.g = g;
        this.i = i;
    }


    public static void main(String[] args) {

    }
}