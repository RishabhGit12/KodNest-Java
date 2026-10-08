package track.M05_OOPs.T02;

public class SuperKeyword {

    public static void main(String[] args) {
        SuperChild c = new SuperChild();
        c.display();
    }
}

class SuperParent {

    int a = 10;
}

class SuperChild extends SuperParent {

    int a = 20;

    void display() {
        System.out.println("Parent class a: " + super.a);
        System.out.println("Child  class a: " + a);
    }
}
