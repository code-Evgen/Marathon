package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("lesson15.txt");
        printResult(file);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String mainLine = scanner.nextLine();
            String[] linesMass = mainLine.split(" ");
            int sum = 0;
            int count = 0;
            for (String line: linesMass){
                sum += Integer.parseInt(line);
                count++;
            }
            double mean = (double) sum / count;
            System.out.printf(mean + " --> %.3f", mean);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

