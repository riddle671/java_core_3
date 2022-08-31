package org.homework2.task1;

public class Bull {

        int age;
        int weigt;
        // Длина шерсти
        int coatlength;
        // цвет шерсти
        String coatcolor;


public Bull(int bullAge, int bullWeigt, int bullCoatlegth, String bullCoatcolor){
        this.age = bullAge;
        this.weigt = bullWeigt;
        this.coatlength = bullCoatlegth;
        this. coatcolor = bullCoatcolor;

}

        @Override
        public String toString() {
                return "Bull{" +
                        "age=" + age +
                        ", weigt=" + weigt +
                        ", coatlength=" + coatlength +
                        ", coatcolor='" + coatcolor + '\'' +
                        '}';
        }
}
