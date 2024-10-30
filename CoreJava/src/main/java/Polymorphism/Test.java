package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Square sq = new Square(2);
        sq.getArea();

        Rectangle rt = new Rectangle(3,4);
        rt.getArea();

        Rectangle rct = new Rectangle(6.2, 3.4);
        rct.getArea();

        Circle cir = new Circle(5);
        cir.getArea();

        Shape circ = new Circle(4.2);
        circ.getArea();
    }
}
