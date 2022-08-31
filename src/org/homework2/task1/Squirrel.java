package org.homework2.task1;

public class Squirrel {

        int age;
        int weigt;
        // длина шерсти
        int coatlength;
        // цвет шерсти
        String coatcolor;

public Squirrel(int squirrelAge, int squirrelWeigt, int squirrelCoatlegth, String squirrelCoatcolor){
        this.age = squirrelAge;
        this.weigt = squirrelWeigt;
        this.coatlength = squirrelCoatlegth;
        this. coatcolor = squirrelCoatcolor;
}

        @Override
        public String toString() {
                return "Squirrel{" +
                        "age=" + age +
                        ", weigt=" + weigt +
                        ", coatlength=" + coatlength +
                        ", coatcolor='" + coatcolor + '\'' +
                        '}';
        }
}

