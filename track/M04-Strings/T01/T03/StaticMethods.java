package T03;

public class StaticMethods {

    public static void main(String[] args) {
        // Static methods can be called directly without creating an object using class name.
        Car.convertKmIntoMiles();

        // Non-Static/Instance methods need to create object for execution.
        Car nano = new Car();
        nano.calculateMileage();

        Car bmw = new Car();
        bmw.calculateMileage();
    }
}

class Car {

    static void convertKmIntoMiles() {
        System.out.println("Converting Kms to Miles.");
    }

    void calculateMileage() {
        System.out.println("Calculating Mileage.");
    }
}
