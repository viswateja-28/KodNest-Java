
class Freq {

    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Key count:" + count);
    }
}

public class Count {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10, 50, 15};
        Freq f = new Freq();
        f.count(arr, 30);
    }
}
