package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("JavaMarathon2021\\src\\main\\resources\\numbers19.txt");
        try {
            Scanner sc = new Scanner(file);
            Set<Integer> hashSet = new HashSet<>();
            while (sc.hasNext()){
                hashSet.add(sc.nextInt());
            }
            int count = 0;
            for (Integer entry: hashSet){
                if ((entry > 500000000) & (entry < 600000000)){
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
