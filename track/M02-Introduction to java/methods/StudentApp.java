
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();

        // Create one Student object
        Student stu = new Student();

        // Call setName() and displayName()
        stu.setName(name);
        stu.displayName();
    }
}
