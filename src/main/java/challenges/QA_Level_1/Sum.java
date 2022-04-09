package challenges.QA_Level_1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Type the 1st number: ");
        A = sc.nextInt();
        System.out.println("Type the 2nd number: ");
        B = sc.nextInt();

        System.out.println("SOMA = " + sum(A, B));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
