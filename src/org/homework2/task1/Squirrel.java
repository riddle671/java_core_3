package org.homework2.task1;

public class Squirrel {

        private int age;
        private int weigt;
        // длина шерсти
        private int coatlength;
        // цвет шерсти
        private String coatcolor;

public Squirrel(int squirrelAge, int squirrelWeigt, int squirrelCoatlegth, String squirrelCoatcolor){
        this.age = squirrelAge;
        this.weigt = squirrelWeigt;
        this.coatlength = squirrelCoatlegth;
        this.coatcolor = squirrelCoatcolor;
}
public void getInfo(){
        System.out.println(this.age);
        System.out.println(this.weigt);
        System.out.println(this.coatlength);
        System.out.println(this.coatcolor);
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

