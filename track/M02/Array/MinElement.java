package track.M02.Array;

import java.util.Scanner;

public class MinElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min < a[i]) {
                min = a[i];
            }
        }

        System.out.println("Min: " + min);
    }
}
