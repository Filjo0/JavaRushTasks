package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(bufferedReader.readLine()));

        bufferedReader.close();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        int index1 = 0, index2 = 0;
        while (fileReader1.ready()) {
            list1.add(fileReader1.readLine());
        }
        fileReader1.close();
        while (fileReader2.ready()) {
            list2.add(fileReader2.readLine());
        }
        fileReader2.close();
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1).equals(list2.get(index2))) {
                lines.add(new LineItem(Type.SAME, list1.get(index1)));
                index1++;
                index2++;
            } else if (index1 + 1 < list1.size() && list1.get(index1 + 1).equals(list2.get(index2))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(index1++)));
            } else if (index2 + 1 < list2.size() && list1.get(index1).equals(list2.get(index2 + 1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(index2++)));

            }

            if (index1 == list1.size() && index2 < list2.size()) {
                lines.add(new LineItem(Type.ADDED, list2.get(index2)));
            }
            if (index2 == list2.size() && index1 < list1.size()) {
                lines.add(new LineItem(Type.REMOVED, list1.get(index1)));
            }
        }


    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
