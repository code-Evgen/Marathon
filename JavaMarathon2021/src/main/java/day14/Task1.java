package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("lesson14.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        String lines = scanner.nextLine();
        String[] lineMass = lines.split(" ");
        scanner.close();
        if (lineMass.length != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
        else{
            int[] numbers = new int[lineMass.length];
            int sum = 0;
            for (String line: lineMass){
                sum += Integer.parseInt(line);
            }
            System.out.println(sum);
        }

    }
}
