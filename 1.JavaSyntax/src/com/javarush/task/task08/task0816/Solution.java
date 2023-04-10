package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("A", dateFormat.parse("AUG 1 2012"));
        map.put("B", dateFormat.parse("SEP 1 2012"));
        map.put("C", dateFormat.parse("FEB 1 2012"));
        map.put("D", dateFormat.parse("JAN 1 2012"));
        map.put("E", dateFormat.parse("JUN 1 2012"));
        map.put("F", dateFormat.parse("JUL 1 2012"));
        map.put("G", dateFormat.parse("OCT 1 2012"));
        map.put("H", dateFormat.parse("DEC 1 2012"));
        map.put("J", dateFormat.parse("NOV 1 2012"));

        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.values().removeIf(s -> s.getMonth() >= 5 && s.getMonth() <= 7);

    }

    public static void main(String[] args) {

    }
}
