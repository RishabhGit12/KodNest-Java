package track.M02.Constructor;

public class ConstructorApplication {

    public static void main(String[] args) {
        Student s1 = new Student("Rani", 19, 4.5);
        s1.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    public Student(String name, int age, double height) {
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
