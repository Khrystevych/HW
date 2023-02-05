package HW5;

import HW5.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setCourse(4);
        student.setGrade(10);
        student.showInfo();
    }
}
