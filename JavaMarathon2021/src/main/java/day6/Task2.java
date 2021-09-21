package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2019, 150, 5000);
        plane1.setProducer("Boeing");
        plane1.setLength(100);
        plane1.setYear(2020);
        plane1.fillUp(10);
        plane1.fillUp(12);
        plane1.info();
    }
}
