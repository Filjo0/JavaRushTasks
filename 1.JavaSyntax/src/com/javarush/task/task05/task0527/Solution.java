package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse jMouse = new Mouse("J", 1, 2);
        Mouse jerMouse = new Mouse("jer", 2, 3);
        Cat tomCat = new Cat("Tom", 1, 2);
        Cat tCat = new Cat("T", 1, 2);
        Cat motCat = new Cat("mot", 1, 2);
        Dog luDog = new Dog("Lu", 1, 2);
        Dog tDog = new Dog("T", 1, 2);
        Dog motDog = new Dog("mot", 1, 2);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog (String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}

    //напишите тут ваш код
