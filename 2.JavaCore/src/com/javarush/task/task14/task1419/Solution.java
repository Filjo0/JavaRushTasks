package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            int a = 1;
            int b = 0;
            int c = a / b;

        } catch (NullPointerException e) {
            exceptions.add(e);
        } catch (ArithmeticException ex) {
            exceptions.add(ex);
        }

        try {
            short a = 1;
            short b = Short.parseShort(null);
            int c = a / b;

        } catch (ArithmeticException ex) {
            exceptions.add(ex);
        } catch (NullPointerException e) {
            exceptions.add(e);
        } catch (NumberFormatException ex) {
            exceptions.add(ex);
        }
        try {
            Object obj = new Object();
            if (obj == null) {
                throw new IllegalArgumentException("obj не может быть равно null");
            }
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        try {
            method1();
        } catch (
                FileNotFoundException ex) {
            exceptions.add(ex);
        } catch (
                ClassNotFoundException ex) {
        }
        try {
            method1();
        } catch (
                ClassNotFoundException ex) {
            exceptions.add(ex);
        } catch (
                FileNotFoundException e) {
        }

        try {
            method1();
        } catch (
                RuntimeException e) {
            exceptions.add(e);
        } catch (
                FileNotFoundException e) {
        } catch (ClassNotFoundException e) {
        }

        try {
            int[] array = new int[2];
            System.out.println(array[10]);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[-2];
            System.out.println(array[-2]);
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        int result = 0;
        try {
            result = getAreaValue(-1, 100);
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        try {
            print(null);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            String password = "123";
            for (int i = 0; i < password.length(); i++) {
                if ((password.charAt(i)) == (password.charAt(i + 1))) {
                    i++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
    }

    //напишите тут ваш код

    public static void method1() throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
        method2();
    }

    public static void method2() {
        System.out.println("method2");
        String s = "Message: Unknown Exception";
        throw new RuntimeException(s);
    }

    public static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x=" + x + ", y=" + y);
        return x * y;
    }

    public static void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
    }

}
