package track.M05_OOPs.T03;

public class MethodOverriding {

    public static void main(String[] args) {
        OverrideParent p = new OverrideParent();
        p.disp1();
        p.disp2();

        OverrideChild c = new OverrideChild();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}

class OverrideParent {

    void disp1() {
        System.out.println("Parent disp1");
    }

    void disp2() {
        System.out.println("Parent disp2");
    }
}

class OverrideChild extends OverrideParent {
    // disp1() : Inherited Method

    // Overriden Method
    @Override
    void disp2() {
        System.out.println("Child disp2");
    }

    // Child specialized method
    void disp3() {
        System.out.println("Child disp3");
    }
}
