package challenges.QA_Level_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.IntStream;

public class OrdinationOddEven {

    static Scanner inputs = new Scanner(System.in);
    static Scanner firstNumber = new Scanner(System.in);
    static int qttInputs = 0;

    public static void main(String[] args) {
        System.out.println("Enter how many numbers do you want ordinate: ");

        ordinationOddEven(getQttInputs());
    }

    public static Vector ordinationOddEven(int quantity) {

        Vector oddNumbers = new Vector(0);
        Vector evenNumbers = new Vector(0);

        for (int i = 0; i < getQttInputs(); i++) {
            int number = inputs.nextInt();

            while (number > 10000 || number < 1) {
                System.out.println("The number must be in range 0 < number < 10001!");
                number = inputs.nextInt();
            }
            if (number % 2 == 0) {
                oddNumbers.add(number);
            } else {
                evenNumbers.add(number);
            }
        }

        System.out.println("================ORGANIZING================");

        organizingEvenInAscendantOrderAndOddInDescendantOrder(oddNumbers, evenNumbers);

        return oddNumbers;
    }

    public static int getQttInputs() {
        if (qttInputs == 0) {
            qttInputs = firstNumber.nextInt();
            System.out.println("Type one number per line:");
        }
        return qttInputs;
    }

    public static void organizingEvenInAscendantOrderAndOddInDescendantOrder(Vector odd, Vector even) {
        Collections.sort(odd);
        Collections.sort(even);
        Collections.reverse(even);

        odd.addAll(even);

        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }
    }
}
