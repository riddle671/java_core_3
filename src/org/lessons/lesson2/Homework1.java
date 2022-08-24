package org.lessons.lesson2;



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

// Задача 5
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


        }

    }



