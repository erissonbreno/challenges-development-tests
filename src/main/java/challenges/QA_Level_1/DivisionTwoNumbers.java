package challenges.QA_Level_1;

import java.util.Locale;
import java.util.Scanner;

public class DivisionTwoNumbers {
    static Scanner input = new Scanner(System.in);
    static int qttDivisions;
    static double first, second;

    public static void main(String[] args) {
        System.out.println("Type how many divisions you going to do: ");
        qttDivisions = input.nextInt();
        performDivision(first, second);
    }

    public static void performDivision(double firstNumber, double secondNumber) {
        for (int i = 0; i < qttDivisions; i++) {
            System.out.println("Type the 1st number: ");
            first = input.nextDouble();
            System.out.println("Type the 2nd number: ");
            second = input.nextDouble();

            checkImpossibleDivision();


            System.out.printf(Locale.US, "The result is: %.1f \n", first / second);
            System.out.println("--------------------");
        }
    }

    public static void checkImpossibleDivision() {
        while (second == 0) {
            System.out.println("Impossible Division, type another number: ");
            second = input.nextDouble();
        }
    }

}
