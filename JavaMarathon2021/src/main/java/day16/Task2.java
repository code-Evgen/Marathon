package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        try {
            file1.createNewFile();
            PrintWriter pw = new PrintWriter(file1);
            Random rand = new Random();
            for (int i = 0; i < 1000; i++){
                pw.print(rand.nextInt(100));
                pw.print(" ");
            }
            pw.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Не удалось создать файл");
        }

        File file2 = new File("file2.txt");
        try {
            Scanner scanner = new Scanner(file1);
            file2.createNewFile();
            PrintWriter pw2 = new PrintWriter(file2);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double mean = 0D;
            int sum = 0;
            for (int i = 0; i < numbers.length; i++ ){
                sum += Integer.parseInt(numbers[i]);
                if (((i + 1) % 20) == 0 ){
                    mean = (double) sum / 20;
                    pw2.print(mean);
                    pw2.print(" ");
                    sum = 0;
                }
            }
            scanner.close();
            pw2.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Не удалось создать файл");
        }

        printResult(file2);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0D;
            for (String number: numbers){
                sum += Double.parseDouble(number);
            }
            int sumInt = (int)sum;
            System.out.println(sumInt);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
