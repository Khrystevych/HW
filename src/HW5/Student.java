package HW5;

public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        if (name1.length() > 2) {
            name = name1;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course1) {
        if (course1 > 0 && course1 < 5) {
            course = course1;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade1) {
        if (grade1 > 0 && grade1 < 11) {
            grade = grade1;
        }
    }

    void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }
}


