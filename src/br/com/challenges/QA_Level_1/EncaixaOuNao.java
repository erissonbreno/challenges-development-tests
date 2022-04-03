package br.com.challenges.QA_Level_1;

import java.util.Scanner;

public class EncaixaOuNao {

//    TODO: Terminar
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            String valorA = Integer.toString(A);
            String valorB = Integer.toString(B);
            if (valorA.contains(valorB)) {
                String subString = valorA.substring(valorB.length());
                System.out.println(subString);
            } else {
                System.out.println("nao encaixa");
            }
        }

    }
}
