package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileR = new FileReader("file.txt");
        } catch(FileNotFoundException f) {
            System.out.println("FILE NOT FOUND");
        }
    }
}
