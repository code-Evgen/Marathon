package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иван Иванович", "Математика");
        Student student1 = new Student("Вася");
        teacher1.evaluate(student1);
    }
}
