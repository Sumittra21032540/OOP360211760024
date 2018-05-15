package lab8;

import lab7.Cat;

public class PetApp {
   public static void main (String[] args) {

       Dog d1 = new Dog();
       d1.setName("Safe");
       d1.setAge(5);

       System.out.println(d1.toString()+"  "+d1.getClass().getSimpleName());

       Cat d2 = new Cat();
       d1.setName("ou");
       d1.setAge ("7");




   }//main
}//class
