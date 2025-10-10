package Beecrowd;

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextInt();

        int numeroDePeca1 = sc.nextInt();

        float valorDaPeca1 = sc.nextFloat();

        sc.nextInt();

        int numeroDePeca2 = sc.nextInt();

        float valorDaPeca2 = sc.nextFloat();

        float valorTotal = numeroDePeca1 * valorDaPeca1 + numeroDePeca2 * valorDaPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
