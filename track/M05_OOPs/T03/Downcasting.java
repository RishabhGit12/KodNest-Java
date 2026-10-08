package track.M05_OOPs.T03;

public class Downcasting {
    public static void main(String[] args) {
        // Parent p = new Child1();
        // p.display1();
        // p.display2();

        // // DownCasting
        // ((Child1)(p)).display3();


        Child1 ch1 = new Child1();
        accessMethod(ch1);

        Child2 ch2 = new Child2();
        accessMethod(ch2);
    }

    public static void accessMethod(Parent ref){
        ref.display1();
        ref.display2();
        if(ref instanceof Child1){
            ((Child1)(ref)).display3();
        } else ((Child2)(ref)).display3();
    }
}

class Parent {
    void  display1(){
        System.out.println("Inside Parent display1");
    }

    void display2(){
        System.out.println("Inside Parent display2");
    }
}

class Child1 extends Parent {
    @Override 
    void display2(){
        System.out.println("Inside Child1 display2");
    }

    void display3(){
        System.out.println("Inside Child1 display3");
    }
}

class Child2 extends Parent {
    @Override
    void display2(){
        System.out.println("Inside Child2 display2");
    }

    void display3(){
        System.out.println("Inside Child2 diplay3");
    }
}