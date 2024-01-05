import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Knightbook {

    private ArrayList<Person> list;

    public Knightbook() {
        // TODO #1: Instantiate your instance variable, list!
    }

    public void fillFromFile() {
        // Create a Scanner to read in from the file "school_data.txt"
        Scanner s;
        File data = new File("Resources/school_data.txt");
        try {
            s = new Scanner(data);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open School Data file.");
            return;
        }

        // For each line in the file, create MenloStudent or Teacher objects
        // And add them to the list.
        while(s.hasNextLine()) {
            // Get data that is shared by both classes
            String type = s.nextLine();
            String first = s.nextLine();
            String last = s.nextLine();
            int age = s.nextInt();
            // If the data is for a MenloStudent, construct a MenloStudent object
            if (type.equals("Student")) {
                int grade = s.nextInt();
                s.nextLine();
                String advocate = s.nextLine();
                list.add(new MenloStudent(first, last, age, grade, advocate));
                // TODO #2: Add a MenloStudent class so this runs correctly!
            }
            // Otherwise, construct a Teacher object
            else if (type.equals("Teacher")) {
                int salary = s.nextInt();
                s.nextLine();
                String subject = s.nextLine();
                list.add(new Teacher(first, last, age, salary, subject));
                // TODO #3: Add a Teacher class so this runs correctly!
            }
        }
    }

    public void printAll() {
        // TODO #4: Finish this method so all members of the list are printed!
    }

    public static void main(String[] args) {
        Knightbook k = new Knightbook();
        k.fillFromFile();
        k.printAll();
    }
}
