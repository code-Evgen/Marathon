package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String> people = new ArrayList<>();
        while (scanner.hasNext()){
            people.add(scanner.nextLine());
        }
        return people;
    }
}
