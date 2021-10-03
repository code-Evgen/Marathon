package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    private static Object IOException;

    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            System.out.println(parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (java.io.IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<Person> parseFileToObjList(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line;
        String[] lineMas;
        List<Person> persons = new ArrayList<>();
        while (scanner.hasNext()){
            lineMas = scanner.nextLine().split(" ");
            if (Integer.parseInt(lineMas[1]) < 0) throw new IOException();
            Person person = new Person(lineMas[0], Integer.parseInt(lineMas[1]));
            persons.add(person);
        }
        return persons;
    }
}
