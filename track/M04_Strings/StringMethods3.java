
public class StringMethods3 {

    public static void main(String[] args) {
        // String to Array Of Characters
        String s1 = "Java";
        char arr[] = s1.toCharArray();
        for (char ch : arr) {
            System.out.println(ch);
        }

        // Character Array to String
        String res = new String(arr);
        System.out.println(res);
    }
}
