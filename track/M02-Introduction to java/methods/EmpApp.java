
import java.util.Scanner;

public class EmpApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and salary
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.setDetails(name, salary);
        employee.displayDetails();
    }
}
