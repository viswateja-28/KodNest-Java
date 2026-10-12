
import java.util.Scanner;

class ScoreAnalyzer {

    int calculateTotal(int[] scores) {
        int total = 0;

        for (int score : scores) {
            total = total + score;
        }
        return total;
    }

    void improveLowScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 40) {
                scores[i] = scores[i] + 5;
            }
        }
    }

    void display(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}

public class ArrayWithObjandclass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size must be positive");
            return;
        }
        int[] scores = new int[size];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        ScoreAnalyzer analyzer = new ScoreAnalyzer();
        System.out.println("Total before improvement: " + analyzer.calculateTotal(scores));

        analyzer.improveLowScores(scores);

        System.out.println("Scores after improvement:");
        analyzer.display(scores);
        System.out.println("Total after improvement: " + analyzer.calculateTotal(scores));

    }
}
