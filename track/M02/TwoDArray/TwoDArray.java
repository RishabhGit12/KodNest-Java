package track.M02.TwoDArray;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[][] = new int[3][5];
            System.out.println("Insert Values: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Values are: ");
            for (int[] row : a) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}
