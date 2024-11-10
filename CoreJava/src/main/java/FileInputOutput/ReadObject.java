package FileInputOutput;

import java.io.*;

public class ReadObject {

    public static void main(String[] args) {
        System.out.println("Deserialization Demo!!!");

        String fileName = "/Users/AF35861/Library/CloudStorage/OneDrive-ElevanceHealth/Desktop/JavaProjects/CoreJava/Testfile.txt";

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stObject = (Student) ois.readObject();

            System.out.println(stObject.getStudentName());
            System.out.println(stObject.getStudentID());

            ois.close();
            fis.close();

            System.out.println("Object Read from the file");

        } catch (FileNotFoundException f) {
            System.out.println(f);
        } catch(IOException io) {
            System.out.println(io);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
