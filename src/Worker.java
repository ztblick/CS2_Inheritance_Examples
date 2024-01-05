import java.lang.annotation.Inherited;

// A Worker is a Person who has a salary.
public class Worker extends Person {

    // Instance variables
    private int salary;

    // Constructor
    public Worker(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    // Methods, including toString()
    @Override
    public String toString() {
        return super.toString() + "\nSalary: $" + salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
