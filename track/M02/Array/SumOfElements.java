package track.M02.Array;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[5];

            System.out.println("Enter 5 Elements: ");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Array Elements Are: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }

            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println();
            System.out.println("Sum: " + sum);
        }
    }
}
