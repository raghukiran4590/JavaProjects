package Static;

public class Student {

    private int rollNo;
    private int marks;

    private static Student student;

    static {
        student = new Student(5,100 );
    }

    private Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public static Student getInstance() {
        return student;
    }

    public static void main(String[] args) {
        /*Student st = new Student();
        System.out.println(st);
        Student st1 = new Student();
        System.out.println(st1);*/


    }
}
