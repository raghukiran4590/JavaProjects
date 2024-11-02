package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferFileReader {
    public static void main(String[] args) {
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("file.txt"));
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException i) {
            System.out.println(i);
            System.out.println("Try-With-Resources");
        } /*finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException o) {
                System.out.println(o);
            }
        }*/
    }
}
