package Interfaces;

public interface Animal {

    static int MAX_AGE = 100;
    int CURRENT_AGE = 25;

    public void eat();
    void sleep();

    static void displayAges() {
        System.out.println("Current age is : "+CURRENT_AGE);
        System.out.println("Current age is : "+MAX_AGE);
    }

    default void displayColors() {
        System.out.println("Cat is brown and the Dog is black in color...");
    }

}
