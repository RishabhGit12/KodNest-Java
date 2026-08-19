package track.M02.TwoDArray;

import java.util.Scanner;

public class TwoDArray2 {

    public static void main(String[] args) {
        //3 Classes with 4,3 and 5 Students in them
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][];
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];

        System.out.println("Insert Values: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Values are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
