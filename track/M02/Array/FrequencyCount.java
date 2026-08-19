package track.M02.Array;

public class FrequencyCount {

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 330, 10, 30};
        Freq fs = new Freq();
        fs.count(arr, 30);
    }
}

class Freq {

    void count(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println(key + ": " + count);
    }
}
