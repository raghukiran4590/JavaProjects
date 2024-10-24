package ShallowCopy;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Shallow Cloning");
        Subject sb = new Subject(100, 90, 80, 70);
        Student st1 = new Student("Raghu", "Tampa", sb);

        Student st2 = (Student) st1.clone();

        st2.sj.science = 99;

        Student st3 = st1;

        st3.sj.science = 88;

        st2.name="Ravi";

        System.out.println(st1+" "+st2+" "+st3);

        st1.name="Raj";

        System.out.println(st2.name+st2.address+st3.sj.science);

        System.out.println(st1.name+st1.address+st1.sj.science);

        System.out.println(st3.name+st3.address+st3.sj.science);
    }
}
