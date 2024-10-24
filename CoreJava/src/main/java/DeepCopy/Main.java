package DeepCopy;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Deep Cloning");

        Subject sb = new Subject(100, 90, 80, 70);

        Student st1 = new Student("Raghu", "Tampa", sb);

        Student st2 = (Student) st1.clone();

        System.out.println(st1+" "+st2);

        System.out.println(st1.sj.computers+" "+st2.sj.computers);

    }
}
