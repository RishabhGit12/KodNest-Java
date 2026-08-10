
import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte value: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is: " + a);

        System.out.println("Enter short value: ");
        short b = sc.nextShort();
        System.out.println("Short value is: " + b);

        System.out.println("Enter integer value: ");
        int c = sc.nextInt();
        System.out.println("Integer value is: " + c);

        System.out.println("Enter long value: ");
        long d = sc.nextLong();
        System.out.println("Long value is: " + d);

        System.out.println("Enter float value: ");
        float e = sc.nextFloat();
        System.out.println("Float value is: " + e);

        System.out.println("Enter double value: ");
        double f = sc.nextDouble();
        System.out.println("Double dounle is: " + f);

        System.out.println("Enter boolean value: ");
        boolean g = sc.nextBoolean();
        System.out.println(" Boolean is: " + g);
    }
}
