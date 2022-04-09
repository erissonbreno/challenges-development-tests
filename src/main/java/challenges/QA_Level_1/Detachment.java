package challenges.QA_Level_1;

import java.util.Scanner;

public class Detachment {
    static int km;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Type how many KM of distance the Y motorcycle is from X motorcycle:");
        performCalculation(km);

    }

    public static void performCalculation(int km) {
        km = input.nextInt();
        double minutes = km * 2;
        System.out.println("Takes " + minutes + " minutes for occurs that detachment.");
    }
}
