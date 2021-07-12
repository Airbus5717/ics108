import java.util.*;
//import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter letter grade: ");
        final String input = scanner.nextLine().toLowerCase();
        scanner.close();

        try {
            System.out.println(gradeConverter(input));
        } catch (InputMismatchException err) {
            System.out.println(err);
            System.exit(1);
        }
    }

    public static double gradeConverter(final String letter) throws InputMismatchException {
        final String[] letterGrades = { "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" };
        final double[] grades = { 4.0, 3.75, 3.5, 3.0, 2.75, 2.5, 2.0, 1.75, 1.0 };
        int location = -1;
        for (int i = 0; i < letterGrades.length; i++) {
            if (letterGrades[i].equals(letter)) {
                location = i;
            }
        }
        if (location == -1)
            throw new InputMismatchException("Invalid grade");
        return grades[location];
    }
}
