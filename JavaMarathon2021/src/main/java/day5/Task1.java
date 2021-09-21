package day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите модель");
        car1.setModel(in.nextLine());
        System.out.println("Введите цвет");
        car1.setColor(in.nextLine());
        System.out.println("Введите год выпуска");
        car1.setYear(in.nextInt());
        System.out.println("---------------");
        System.out.println(car1.getModel() + " | " + car1.getColor() + " | " + car1.getYear());
        in.close();
    }
}
