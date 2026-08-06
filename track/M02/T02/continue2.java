package track.M02.T02;

public class continue2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
