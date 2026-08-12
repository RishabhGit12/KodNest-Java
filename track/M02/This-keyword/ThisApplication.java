package track.M02.This

-keyword;

public class ThisApplication {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.input("Raja", 20, 5.9);
        s1.print();
    }
}

class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        name = name;
        age = age;
        height = height;
    }

    void print() {
        System.out.println(name + age + height);
    }
}
