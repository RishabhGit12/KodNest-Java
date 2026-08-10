package track.M02.T02;

public class labelledLoops {

    public static void main(String[] args) {
        // Breaking labelled loops
        outer:
        for (int i = 1; i < 10; i++) {
            inner:
            for (int j = 1; j < 10; j++) {
                if (j == 6) {
                    break outer;
                }
                System.out.println(j);
            }
        }

        // Continue labelled loops
        outer:
        for (int i = 1; i < 10; i++) {
            inner:
            for (int j = 1; j < 10; j++) {
                if (j == 6) {
                    continue outer;
                }
                System.out.println(j);
            }
        }
    }
}
