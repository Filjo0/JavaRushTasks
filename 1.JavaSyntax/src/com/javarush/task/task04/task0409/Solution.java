package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int c = 10 - a;
        c = abs(c);
        int d = 10 - b;
        d =abs(d);
        if (c<d){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        }



    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}