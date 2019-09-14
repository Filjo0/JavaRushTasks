package com.javarush.task.task08.task0824;

import java.util.*;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("g", true, 20);
        Human child2 = new Human("h", false, 20);
        Human child3 = new Human("j", true, 12);
        Human father = new Human("e", true, 50, child1, child2, child3);
        Human mother = new Human("f", false, 45, child1, child2, child3);
        Human grandFather1 = new Human("a", true, 80, father);
        Human grandFather2 = new Human("b", true, 82, mother);
        Human grandMother1 = new Human("c", false, 77, father);
        Human grandMother2 = new Human("d", false, 75, mother);

        ArrayList<Human> humans = new ArrayList<>(Arrays.asList(grandFather1, grandFather2, grandMother1, grandMother2, father, mother, child1, child2, child3));
        for (Human h : humans) {
            System.out.println(h);
        }


        //напишите тут ваш код
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, Boolean sex, int age, Human... child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(child));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
