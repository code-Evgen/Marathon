package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;
    private Random rand = new Random();

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void evaluate(Student student){
        int mark = rand.nextInt(3) + 2;
        String markString = "";
        switch (mark) {
            case 2:
                markString = "неудовлетворительно";
                break;
            case 3:
                markString = "удовлетворительно";
                break;
            case 4:
                markString = "хорошо";
                break;
            case 5:
                markString = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + lesson + " на оценку " + markString + ".");
    }
}
