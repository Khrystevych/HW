public class Student {
    int idNumber;
    String name;
    String surname;
    int course;
    int averageScoreMath;
    int averageScoreEconomy;
    int averageScoreLanguage;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.idNumber = 100;
        st1.name = "Maria";
        st1.surname = "Ivashko";
        st1.course = 1;
        st1.averageScoreMath = 3;
        st1.averageScoreEconomy = 4;
        st1.averageScoreLanguage = 4;
        float st1AverageGrade = (st1.averageScoreMath + st1.averageScoreEconomy + st1.averageScoreLanguage) / 3F;

        Student st2 = new Student();
        st2.idNumber = 150;
        st2.name = "Denys";
        st2.surname = "Petrenko";
        st2.course = 4;
        st2.averageScoreMath = 5;
        st2.averageScoreEconomy = 5;
        st2.averageScoreLanguage = 4;
        float st2AverageGrade = (st2.averageScoreMath + st2.averageScoreEconomy + st2.averageScoreLanguage) / 3F;

        Student st3 = new Student();
        st3.idNumber = 205;
        st3.name = "Anna";
        st3.surname = "Kovalenko";
        st3.course = 3;
        st3.averageScoreMath = 3;
        st3.averageScoreEconomy = 4;
        st3.averageScoreLanguage = 3;
        float st3AverageGrade = (st3.averageScoreMath + st3.averageScoreEconomy + st3.averageScoreLanguage) / 3F;

        System.out.println("Student ID: " + st1.idNumber + ", " + st1.name + " " + st1.surname + ", Course: " + st1.course +
                ", Average score: " + Math.round(st1AverageGrade));

        System.out.println("Student ID: " + st2.idNumber + ", " + st2.name + " " + st2.surname + ", Course: " + st2.course +
                ", Average score: " + Math.round(st2AverageGrade));

        System.out.println("Student ID: " + st3.idNumber + ", " + st3.name + " " + st3.surname + ", Course: " + st3.course +
                ", Average score: " + Math.round(st3AverageGrade));


    }
}


