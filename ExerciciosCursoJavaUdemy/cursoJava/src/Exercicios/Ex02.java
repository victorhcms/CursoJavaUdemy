package Exercicios;

import java.util.Locale;
import java.util.Scanner;
/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

public class Ex02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;

        double pi;

        double area;

        pi = 3.14159;

        raio = sc.nextDouble();

        area = pi * raio * raio;

    
        System.out.printf("A= %.4f%n", area);

        sc.close();

    }
}
