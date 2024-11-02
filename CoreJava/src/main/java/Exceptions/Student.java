package Exceptions;

import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLException;

public class Student {
    private int id;
    public static void main(String[] args) throws NullPointerException{
        try {
            Student s = null;
//            Student s = new Student();
            s.id = 124;
            System.out.println("No Exceptions");
        } catch (NullPointerException n) {
            System.out.println(n);
        } catch(ArithmeticException a){
            System.out.println(a);
        } catch (IndexOutOfBoundsException | IllegalArgumentException s) {
            System.out.println(s);
//            throw new FileSystemNotFoundException();
        } catch(Exception e) {
            System.out.println(e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            for(int i = 0; i< stackTrace.length; i++){
                System.out.println(stackTrace[i]);
            }
//            e.printStackTrace();
        }
    }
}
