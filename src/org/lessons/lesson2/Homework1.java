package org.lessons.lesson2;


import java.lang.reflect.Array;
import java.util.Arrays;

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
        char[] massiv = {'a', 'b', 'c', 'd' , 'e'};
        String stroka = String.valueOf(massiv);
        System.out.println(stroka);
        massiv[3]= 'h';
        String stroka2 = String.valueOf(massiv);
        System.out.println(stroka2);

// Задача 4
        String buk = "a";
        for (int i = 1; i < 101; i++) {
            System.out.print(i + buk + " ");
        }


// Задача 5 ( Не переносит на следующую строку)
        int ageChildren = 11;
        if (ageChildren < 6){
        System.out.println("Пошел в сад");}
        else if (ageChildren < 11) {
            System.out.println("Пошел в младушую школу");}
        else if (ageChildren < 17){
            System.out.println("Пошел в среднюю школу");}
        else {
            System.out.println("Пошел в университет");
        }

// Задача 1 продвин.  (спросить про Integer) parseInt() - преобр. строку в число


        String s = "234";
        int i = Integer.parseInt(s);
        System.out.println(i);

// Задача 2
        int a = 3;
        int b = 5;
        int ab =(a+b)^2;
        System.out.println(ab);

// Задача 3




        int[] number1 = {1, 2, 5, 7, 10};
        int[] number2 = {2, 3, 2, 17, 15};




        int[]aa = {1,2,3,4};
        int[] bb = {4, 16, 1, 2, 3, 22};
        int[] c = new int[aa.length + bb.length];
        int count = 0;
        for (int ii = 0; ii < aa.length; ii++) {
            c[ii] = aa[ii];
            count++;
        }
        for (int j = 0; j < bb.length; j++) {
            c[count++] = bb[j];
        }
        for (int ii = 0; i < c.length; ii++)
            System.out.print(c[ii] + " ");







            }
        }
















