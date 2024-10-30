package Polymorphism;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void getArea() {
        System.out.println("Area of Square is : "+(side+side));
    }
}
