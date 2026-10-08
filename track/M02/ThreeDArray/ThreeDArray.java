package track.M02.ThreeDArray;

import java.util.Scanner;

public class ThreeDArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[][][] = new int[3][3][5];

            System.out.println("Enter Elements: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    for (int k = 0; k < a[i][j].length; k++) {
                        a[i][j][k] = sc.nextInt();
                    }
                }
            }

            System.out.println("Elements are: ");
            for (int[][] layer : a) {
                for (int[] row : layer) {
                    for (int elem : row) {
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
