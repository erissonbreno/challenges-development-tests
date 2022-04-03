package br.com.challenges.QA_Level_2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0.

Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco
antes e depois da igualdade. Utilize variáveis de dupla precisão (double).
 */

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Type 1st note and press ENTER:");
        double nota1 = input.nextDouble();
        System.out.println("Type 2nd note and press ENTER:");
        double nota2 = input.nextDouble();

        while (nota1 > 10) {
            System.out.println("1st note is bigger than 10, please type again: ");
            nota1 = input.nextDouble();
        }

        while (nota2 > 10) {
            System.out.println("2nd note is bigger than 10, please type again: ");
            nota2 = input.nextDouble();
        }

        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        nf.setMaximumFractionDigits(5);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("0.00000");


        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
        var mediaPresentation = "MEDIA = " + nf.format(media);

        System.out.println(mediaPresentation);
        System.out.println("------------------------------");
    }
}
