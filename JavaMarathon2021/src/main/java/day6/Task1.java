package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setColor("Black");
        car1.setYear(2015);
        Motorbike bike1 = new Motorbike("Suzuki", "red", 1999);
        car1.info();
        System.out.println(car1.yearDifference(2021));
        bike1.info();
        System.out.println(bike1.yearDifference(2021));
    }
}
