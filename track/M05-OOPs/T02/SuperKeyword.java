package track.M05

-OOPs.T02;

public class SuperKeyword {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

class Parent {

    int a = 10;
}

class Child extends Parent {

    int a = 20;

    void display() {
        System.out.println("Parent class a: " + super.a);
        System.out.println("Child  class a: " + a);
    }
}
