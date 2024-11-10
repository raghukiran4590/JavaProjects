package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        System.out.println("Serialization Demo!!!");

        String fileName = "/Users/AF35861/Library/CloudStorage/OneDrive-ElevanceHealth/Desktop/JavaProjects/CoreJava/Testfile.txt";

        Student st = new Student(501, "Raghu Kiran");
        System.out.println(st.getStudentID());
        System.out.println(st.getStudentName());

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.close();
            fos.close();
            System.out.println("Object saved in the file");
        } catch (FileNotFoundException f) {
            System.out.println(f);
        } catch(IOException io) {
            System.out.println(io);
        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
