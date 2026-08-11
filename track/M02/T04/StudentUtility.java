package track.M02.T04;

import java.util.Scanner;

class StudentUtility1 {

    public void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    public void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public double getPassingPercentage() {
        return 60.0;
    }

    public double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class StudentUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility1 utility = new StudentUtility1();

        int id = scanner.nextInt();
        scanner.nextLine(); // Consume remaining newline
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double score = utility.calculatePercentage(javaScore, sqlScore);
        double required = utility.getPassingPercentage();

        System.out.println("Percentage: " + score);
        System.out.println("Result: " + ((score >= required) ? "PASS" : "NEEDS IMPROVEMENT"));

        scanner.close();
    }
}
