package ExerciciosCursoJava.Exercicios03;

import java.util.Locale;
import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua média nesse bimestre? ");
        double nota = sc.nextDouble();

        if (nota >= 6.0) {
            System.out.println("Aprovado");
        }
        else if (nota == 5.0) {
            System.out.println("Reucperação");
        }
        else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
