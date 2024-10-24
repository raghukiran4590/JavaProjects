package DeepCopy;

class Student implements Cloneable {

    String name;
    String address;
    Subject sj;

    Student(String name, String address, Subject sj) {
        this.name = name;
        this.address = address;
        this.sj = sj;
    }

    protected Object clone() throws CloneNotSupportedException {
       Student emp = (Student) super.clone();
       emp.sj = (Subject) sj.clone();
       return emp;
    }

}
