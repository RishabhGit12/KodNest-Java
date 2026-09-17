package T03;

public class StaticVsNonStaticBlock {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
    }
}

class Demo {

    // 3 Ststic Blocks
    static {
        System.out.println("1st Static Block Executed");
    }

    static {
        System.out.println("2st Static Block Executed");
    }

    static {
        System.out.println("3st Static Block Executed");
    }

    // 3 Non Static Blocks
    {
        System.out.println("1st Non Static Block Executed");
    }

    {
        System.out.println("2st Non Static Block Executed");
    }

    {
        System.out.println("3st Non Static Block Executed");
    }
}
