package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("A");
        Cat cat2 = new Cat("B");
        Cat cat3 = new Cat("C");
        Cat cat4 = new Cat("D");
        Cat cat5 = new Cat("E");
        Cat cat6 = new Cat("F");
        Cat cat7 = new Cat("G");
        Cat cat8 = new Cat("H");
        Cat cat9 = new Cat("I");
        Cat cat10 = new Cat("J");
        map.put("A", cat1);
        map.put("B", cat2);
        map.put("C", cat3);
        map.put("D", cat4);
        map.put("E", cat5);
        map.put("F", cat6);
        map.put("G", cat7);
        map.put("H", cat8);
        map.put("I", cat9);
        map.put("J", cat10);


            //напишите тут ваш код

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        set.addAll(map.values());
        return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
