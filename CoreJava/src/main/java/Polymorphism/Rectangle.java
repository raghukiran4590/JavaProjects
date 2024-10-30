package Polymorphism;

public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        System.out.println("Area of Rectangle is : "+(length*breadth));
    }
}
