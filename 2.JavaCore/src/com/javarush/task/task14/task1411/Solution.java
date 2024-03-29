package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String[] keys = new String[]{"user", "loser", "coder", "proger"};
        while (Arrays.asList(keys).contains(key = reader.readLine())) {
            if ("user".equals(key)) {
                person = new Person.User();
            } else if ("coder".equals(key)) {
                person = new Person.Coder();
            } else if ("loser".equals(key)) {
                person = new Person.Loser();
            } else if ("proger".equals(key)) {
                person = new Person.Proger();
            } else {
                break;
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
        // пункт 3
    }
}
