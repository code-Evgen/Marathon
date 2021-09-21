package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void evaluate(Student student){
        int mark;
        Random rand = new Random();
        mark = rand.nextInt(3) + 2;
        String mark_string = "";
        switch (mark) {
            case 2:
                mark_string = "неудовлетворительно";
                break;
            case 3:
                mark_string = "удовлетворительно";
                break;
            case 4:
                mark_string = "хорошо";
                break;
            case 5:
                mark_string = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + lesson + " на оценку " + mark_string + ".");
    }
}
