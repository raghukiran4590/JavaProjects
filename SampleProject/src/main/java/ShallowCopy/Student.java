package ShallowCopy;

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
        return super.clone();
    }

}
