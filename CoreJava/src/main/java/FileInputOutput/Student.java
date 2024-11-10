package FileInputOutput;

import java.io.Serializable;

public class Student implements Serializable {

    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }
}
