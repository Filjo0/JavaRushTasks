package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        Cat Cat3 = new Cat();
        cats.add(Cat1);
        cats.add(Cat2);
        cats.add(Cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);  // step 4 - пункт 4
        }
    }

    public static class Cat {
    }
}
