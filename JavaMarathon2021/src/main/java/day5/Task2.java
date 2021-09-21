package day5;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите модель");
        String model = in.nextLine();
        System.out.println("Введите цвет");
        String color = in.nextLine();
        System.out.println("Введите год выпуска");
        int year = in.nextInt();
        Motorbike bike1 = new Motorbike(model, color, year);
        System.out.println("---------------");
        System.out.println(bike1.getModel() + " | " + bike1.getColor() + " | " + bike1.getYear());
        in.close();
    }
}
