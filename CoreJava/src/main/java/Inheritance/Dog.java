package Inheritance;

public class Dog extends Animal {
    String name;
    String color;

    public Dog(String name, String color){
//        super();
        this.name = name;
        this.color = color;
    }
    public void bark(){
        System.out.println("Dog barks");
    }
    public void getName() {
        System.out.println("Name of the Dog : "+name);
    }
    public void getColor() {
        System.out.println("Color of the Dog : "+color);
    }

    public static void main(String[] args) {

        Dog d = new Dog("Tommy", "Brown");
        d.getName();
        d.getColor();
        d.bark();
        d.getType();

    }

}
