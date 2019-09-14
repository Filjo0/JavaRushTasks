package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        Cat Cat3 = new Cat();
        Cat Cat4 = new Cat();
        Cat Cat5 = new Cat();
        Cat Cat6 = new Cat();
        Cat Cat7 = new Cat();
        Cat Cat8 = new Cat();
        Cat Cat9 = new Cat();
        Cat Cat10 = new Cat();

        System.out.println(Cat.catCount);   // Выведи значение переменной catCount
    }

    public static class Cat {
       public static int catCount;    // Создай статическую переменную catCount

        public Cat() {
            Cat.catCount++;
            // Создай конструктор
        }
    }
}

