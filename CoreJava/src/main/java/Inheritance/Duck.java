package Inheritance;

public class Duck extends Animal{

    String color = "White";

    void getName(){
        System.out.println("Duck Name is Steve");
    }

    public static void main(String[] args) {

        Duck d = new Duck();
        d.getName();

        Animal an = new Animal();
        an.getType();

        Animal al = new Duck();
        al.getType();

    }
}
