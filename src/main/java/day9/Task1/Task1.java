package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ella", "ITIS-1904");
        Teacher teacher = new Teacher("May", "Math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
