package track.M05

-OOPs.T02;

public class Inheritance {

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.display();
    }
}

class Demo1 {

    int a = 10;

    void display() {
        System.out.println("Class Demo1: " + a);
    }
}

class Demo2 extends Demo1 {

}
