package Static;

public class Test {
    private static int count;

    static {
        count = 10;
    }

    public Test() {
        count++;
    }

    public static void main(String[] args) {
        /*
        System.out.println(count);
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test t5 = new Test();
        System.out.println(count);


        Student st = new Student();
        System.out.println(st);
        Student st1 = new Student();
        System.out.println(st1);
 */

        Student st1 = Student.getInstance();
        System.out.println(st1);
        Student st2 = Student.getInstance();
        System.out.println(st2);

    }
}
