package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void toEvaluate(Student student) {
        Random random = new Random();
        int randomMark = random.nextInt(4) + 2;

        String mark = "";
        if (randomMark == 2) {
            mark = "неудовлетворительно";
        } else if (randomMark == 3) {
            mark = "удовлетворительно";
        } else if (randomMark == 4) {
            mark = "хорошо";
        } else if (randomMark == 5) {
            mark = "отлично";
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + mark);
    }
}
