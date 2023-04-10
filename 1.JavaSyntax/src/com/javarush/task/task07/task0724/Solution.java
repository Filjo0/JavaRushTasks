package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();

        Human a = new Human("а", true, 1);
        Human b = new Human("б", false, 1);
        Human c = new Human("в", true, 1);
        Human d = new Human("г", false, 1);
        Human e = new Human("д", true, 1, a, b);
        Human f = new Human("е", false, 1, a, b);
        Human g = new Human("ж", true, 1, c, d);
        Human h = new Human("з", false, 1, c, d);
        Human i = new Human("и", true, 1, c, d);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);

        for (Human human : list) {
            System.out.println(human);
        }
        //5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
        //6. Выведи созданные объекты на экран.    // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}