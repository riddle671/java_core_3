package org.homework2.task1;

public class Animals {
   public static void main(String[] args) {

      Bull bull = new Bull(5,750,20, "Black" );
      Squirrel squirrel = new Squirrel(2, 1, 3, "Broun");
      bull.setAge(14);
      bull.setCoatcolor("Red");
      System.out.println(bull.getCoatcolor());



   }
}
