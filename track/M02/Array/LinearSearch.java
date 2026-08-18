package track.M02.Array;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        ArraySearch as = new ArraySearch();
        as.search(arr, 30);
    }
}

class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;

        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                System.out.println("Element found at: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
