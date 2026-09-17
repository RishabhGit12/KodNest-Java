package T03;

public class CountObjects {

    public static void main(String[] args) {
        Obj o1 = new Obj();
        Obj o2 = new Obj();
        Obj o3 = new Obj();
        Obj o4 = new Obj();
        Obj o5 = new Obj();

        System.out.println("Number Of Objects: " + Obj.count);
    }
}

class Obj {

    static int count = 0;

    // Incrementing bcoz a non-static gets execute everytime on object creation.
    {
        count++;
    }
}
