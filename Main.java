import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            line = br.readLine();
            int size = Integer.parseInt(line);
            System.out.println(size);
            while ((line = br.readLine()) != null) {
                String[] sp = line.split("s+");
                for (String i : sp)
                    System.out.println(i);
                switch (sp[0]) {
                    case "C":
                        System.out.println("Today is Saturday");
                        break;
                    case "B":
                        System.out.println("Today is Sunday");
                        break;
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
            /*
             * while ((line = br.readLine())!= null){
             * String[] splited = line.split("s+");
             * int splited_size = splited.length;
             * for (int i = 0; i < splited_size; i++)
             * {
             * if (i==0){
             * if splited[i] == 'C'
             * {
             * vehicles.add(new Car(splited[1], splited[2]);
             * }
             * }
             * }
             * }
             */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}