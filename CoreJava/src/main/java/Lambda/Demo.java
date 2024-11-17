package Lambda;

public class Demo {

    public static void main(String[] args) {

        Employee employee1 = new SoftwareEngineer();
        System.out.println(employee1.getRole());

        Employee employee2 = () -> "Architect";
        System.out.println(employee2.getRole());
    }
}
