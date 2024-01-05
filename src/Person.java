public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person (String firstName, String lastName, int age){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.age = -1;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nAge: %d years", firstName, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}