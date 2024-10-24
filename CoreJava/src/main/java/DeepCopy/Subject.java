package DeepCopy;

class Subject implements Cloneable{

    int maths;
    int science;
    int english;
    int computers;

    Subject(int maths, int science, int english, int computers) {
        this.maths = maths;
        this.computers = computers;
        this.english = english;
        this.science = science;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
