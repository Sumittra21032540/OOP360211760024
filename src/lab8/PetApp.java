package lab8;

public class petApp {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setName("Safe");
        d1.setAge(5);

        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());


        Cat d2 = new lab8.Cat();
        d2.setName("Zaza");
        d2.setAge(3);

        System.out.println(d1.toString() +" "+d2.getClass().getSimpleName());

