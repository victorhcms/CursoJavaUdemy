package Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

public class Ex06 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A, B, C, cir, trap, artr, quad, ret;
        double pi;

        A = sc.nextFloat();

        B = sc.nextFloat();

        C = sc.nextFloat();

        pi = 3.14159;

        artr = (A * C) / 2;

        cir = (float) (pi * C * C);

        trap = ((A + B) * C) /2;

        quad = B * B;

        ret = A * B;

        System.out.printf("TRIANGULO: %.3f%n", artr);
        System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETANGULO:%.3f%n", ret);

        sc.close();
    }
}
