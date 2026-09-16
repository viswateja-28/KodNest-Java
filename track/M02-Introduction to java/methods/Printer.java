
import java.util.Scanner;

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        Printer p = new Printer();
        p.show(number);
        p.show(name);
    }
}
