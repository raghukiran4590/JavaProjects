package Inheritance;

public class Cat extends Animal{
    String name;
    String color;

    public Cat(String name, String color){
//        super();
        this.name = name;
        this.color = color;
    }
    public void meow(){
        System.out.println("Cat meows");
    }
    public void getName() {
        System.out.println("Name of the Cat : "+name);
    }
    public void getColor() {
        System.out.println("Color of the Cat : "+color);
    }

    public static void main(String[] args) {

        Cat c = new Cat("Rosy", "Black");
        c.getName();
        c.getColor();
        c.meow();
        c.getType();

    }
}
