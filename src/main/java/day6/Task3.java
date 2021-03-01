package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ella","Math");
        Student student = new Student("May");

        teacher.toEvaluate(student);
    }
}
