package Interfaces;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        Animal.displayAges();
        System.out.println("Years to Max age : "+(Dog.MAX_AGE - Dog.CURRENT_AGE)/2);

        Cat c = new Cat();
        c.eat();
        c.sleep();
        Animal.displayAges();
        System.out.println("Years to Max age : "+(double)(Dog.MAX_AGE - Dog.CURRENT_AGE)/10);

        d.displayColors();
//        c.displayColors();
    }

}
