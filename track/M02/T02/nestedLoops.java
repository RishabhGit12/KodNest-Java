package track.M02.T02;

public class nestedLoops {

    public static void main(String[] args) {

        // nested for
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }

        }

        // nested while
        int i = 1;
        while (i <= 5) {

            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }

            i++;
        }

        // nested do-while
        int x = 1;
        do {

            int y = 1;
            do {
                System.out.println(y);
                y++;
            } while (y <= 5);

            x++;
        } while (x <= 5);
    }
}
