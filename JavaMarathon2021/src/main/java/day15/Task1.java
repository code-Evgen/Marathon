package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileIn  = new File("JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        File fileOut = new File("JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
        try {
            fileOut.createNewFile();
            PrintWriter pw = new PrintWriter(fileOut);
            Scanner scanner = new Scanner(fileIn);
            String line;
            String[] fields = new String[3];
            while (scanner.hasNext()){
                line = scanner.nextLine();
                fields = line.split(";");
                if (fields[2].equals("0"))
                    pw.println(fields[0] + ", " + fields[1] + ", " + fields[2]);
            }
            scanner.close();
            pw.close();
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}
