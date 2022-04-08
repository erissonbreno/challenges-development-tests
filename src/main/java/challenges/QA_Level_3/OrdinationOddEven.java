package challenges.QA_Level_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.IntStream;

public class OrdinationOddEven {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want ordinate: ");

        int qttInputs = inputs.nextInt();

        Vector oddNumbers = new Vector(0);
        Vector evenNumbers = new Vector(0);

        for (int i = 0; i < qttInputs; i++) {
            int number = inputs.nextInt();

            if (number % 2 == 0) {
                oddNumbers.add(number);
            } else {
                evenNumbers.add(number);
            }
        }

        System.out.println("===================================");

        Collections.sort(oddNumbers);
        Collections.reverse(Arrays.asList(evenNumbers));
//        ArrayUtils

        oddNumbers.addAll(evenNumbers);

        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.println(oddNumbers.get(i));
        }
    }
}
