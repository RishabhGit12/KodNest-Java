package track.M05_OOPs.T02;

public class ConstructorChaining {

    public static void main(String[] args) {
        Child c = new Child();
    }
}

class Parent {

    Parent() {
        System.out.println("Parent cons");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Child 0 par cons");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Child 1 par cons");
    }

    Child(int a, int b) {
        System.out.println("Child 2 par cons");
    }
}
