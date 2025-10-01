package Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class Ex05 {

    @SuppressWarnings("unused") // para silenciar o attention que está dizendo que o codigo1 e codigo2 não estarem sendo declarados.
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2, peca1, peca2;
        
        double valpeca1, valpeca2, valtotal;

        codigo1 = sc.nextInt();
        peca1 = sc.nextInt();
        valpeca1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        peca2 = sc.nextInt();
        valpeca2 = sc.nextDouble();

        valtotal = (peca1 * valpeca1) + (peca2 * valpeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valtotal);

        sc.close();
    }
}
