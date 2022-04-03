package br.com.challenges.QA_Level_1;

import java.util.Scanner;

public class DesafioDistanciamento {
    public static void main(String[] args) {
        int km;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos KM de distância a moto Y está da moto X:");
        km = input.nextInt();
        double minutos = km * 2;
        System.out.println("Levou " + minutos + " minutos para ocorrer esse distanciamento.");
    }
}
