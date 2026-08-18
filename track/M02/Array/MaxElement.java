package track.M02.Array;

import java.util.Scanner;

public class MaxElement {

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

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println("Max: " + max);
    }
}
