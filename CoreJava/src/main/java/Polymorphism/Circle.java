package Polymorphism;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Area of Circle is : "+(radius*2));
    }
}
