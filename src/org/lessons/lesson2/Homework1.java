package org.lessons.lesson2;

import java.awt.*;
import java.util.Locale;
// Задача 1
public class Homework1 {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
String result = hi.trim() + world.toLowerCase() + newLine;
System.out.print(result.repeat(3));

// Задача 2
        float g1 = 100;
        float h1 = 2;
        float g1h1 = g1 / (h1 * h1);
        System.out.println(g1h1);


    }

}
