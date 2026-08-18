package track.M02.Constructor;

public class DifferentConstructors {

    public static void main(String[] args) {
        Student s2 = new Student();
        s2.display();

        Student s3 = new Student("Manu");
        s3.display();

        Student s1 = new Student("Raja", 18, 5.50);
        s1.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
