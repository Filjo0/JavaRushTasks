package com.javarush.task.task19.task1921;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd M yyyy");
                String line = reader.readLine();
                String name = line.split("\\d")[0];
                String birthday = line.split(name)[1];
                name = name.split("\\s$")[0];

                PEOPLE.add(new Person(name.toString().trim(), sdf.parse(birthday)));
                System.out.println(PEOPLE.get(0));
            }
        } catch (IOException e) {
        }
    }
}