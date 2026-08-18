package track.M02.Array;

import java.util.Scanner;

public class pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array Elements Are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }
}
