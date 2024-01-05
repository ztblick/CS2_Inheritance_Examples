import java.util.ArrayList;

// A Student is a Person with a grade.

public class Student extends Person {

    // Instance variables
    private int grade;

    // Constructors
    public Student(String firstName, String lastName, int age, int grade){
        super(firstName, lastName, age);
        this.grade = grade;
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + "\nGrade: " + grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
