
public class Strings {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JavA";
        if (s1 == s2) {
            System.out.println("Ref are same");
        } else {
            System.out.println("Ref are not same");
        }

        String s3 = new String("Raja");
        String s4 = new String("Raja");
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
