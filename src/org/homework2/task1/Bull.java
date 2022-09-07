package org.homework2.task1;

public class Bull {
         int age;
        private int weigt;
        // длина шерсти
        private int coatlength;
        // цвет шерсти
        private String coatcolor;


public Bull(int bullAge, int bullWeigt, int bullCoatlegth, String bullCoatcolor){
        this.age = bullAge;
        this.weigt = bullWeigt;
        this.coatlength = bullCoatlegth;
        this.coatcolor = bullCoatcolor;
      }
      public int getAge(){
      return age;
      }
      public String getCoatcolor(){
        return  coatcolor;

      }

       public void setAge(int newhumanAge){
           this.age = newhumanAge;
                     }
       public void setCoatcolor (String newCoatcolor){
        this.coatcolor = newCoatcolor;

       }




      public void getInfo(){
        System.out.println(this.age);
        System.out.println(this.weigt);
        System.out.println(this.coatlength);
        System.out.println(this.coatcolor);
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
