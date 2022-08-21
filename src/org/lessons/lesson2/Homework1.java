package org.lessons.lesson2;

import java.awt.*;
import java.util.Locale;

public class Homework1 {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
String result = hi.trim() + world.toLowerCase() + newLine;
System.out.print(result.repeat(3));


    }

}
