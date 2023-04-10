package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public static class Cat implements CanClimb, CanRun {

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public static class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public static class Tiger extends Cat {
    }

    public static class Duck implements CanFly, CanRun {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
