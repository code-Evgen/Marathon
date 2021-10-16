package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {
        File file = new File("JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        try {
            Scanner sc = new Scanner(file);
            Map<Integer, Point> map = new HashMap<>();
            String line;
            String[] data;
            while (sc.hasNext()){
                line = sc.nextLine();
                data = line.split(" ");
                map.put(Integer.parseInt(data[0]), new Point(Integer.parseInt(data[1]), Integer.parseInt(data[2])));
            }
            sc.close();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите x1");
            int x1 = sc2.nextInt();
            System.out.println("Введите y1");
            int y1 = sc2.nextInt();
            System.out.println("Введите x2");
            int x2 = sc2.nextInt();
            System.out.println("Введите y2");
            int y2 = sc2.nextInt();
            sc2.close();
            int count = 0;
            for (Map.Entry<Integer, Point> entry: map.entrySet()){
                if ((entry.getValue().getX() > x1) & (entry.getValue().getX() < x2) & (entry.getValue().getY() > y1) & (entry.getValue().getY() < y2)){
                    System.out.println(entry.getKey());
                    count++;
                }
            }
            System.out.println("Количество машин - " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

