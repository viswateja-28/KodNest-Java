
public class Practicepgm {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updateIndex = 1;
        int updateValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i < snapshot.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;
        // Update through liveView.
        liveView[updateIndex] = updateValue;

        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();
        boolean compare = false;
        if (original == liveView) {
            compare = true;
        }
        System.out.println("Same object: " + compare);

        // Validate requestedIndex before accessing original.
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: Valid index");
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
