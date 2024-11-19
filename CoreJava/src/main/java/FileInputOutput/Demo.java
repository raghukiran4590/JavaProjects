package FileInputOutput;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {

        File file = new File("./CoreJava/src/main/java/FileInputOutput/sample.txt");
        file.createNewFile();
//        System.out.println(file.getCanonicalFile());
//        System.out.println(file.canWrite());
        FileWriter fw = new FileWriter(file);
//        fw.write("Hi! I am Raghu Kiran.");
//        fw.close();
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hi! This is Raghu Kiran ");
        bw.append("How are you doing? ");
        bw.append("I am doing well. ");
        bw.newLine();
        bw.append("Shall we go to the beach :)");
        bw.close();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fw.close();
        fr.close();

    }
}
