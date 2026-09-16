
import java.util.Scanner;

public class DemoApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int first = scan.nextInt();
        int second = scan.nextInt();

        Demo d = new Demo();
        d.setName(name);
        d.showName();
        d.showScore(first);
        d.showScore(first, second);
    }
}
