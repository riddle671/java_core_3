package org.lessons.lesson2;

import java.awt.*;
import java.util.Locale;

public class Homework1 {
    public static void main(String[] args) {
// Задача 1
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

// Задача 3
//        String str1 = new String ("a,b,c,d,e");
//        System.out.println(str1);
//        String str2 = new String("a,b,c,d,e".replace('d' , 'h'));
//        System.out.println(str2);
//
//        String str3 = new String(new char[] {'a', 'b', 'c', 'd', 'e'});
//       System.out.println(str3);

        char[] answer3 = {'a', 'b', 'c', 'd' , 'e'};
        String stringFromCharArray = String.valueOf(answer3);
        System.out.println(stringFromCharArray);
        String otvet = stringFromCharArray.replace('d' , 'h');
        System.out.println(otvet);
    }
}

