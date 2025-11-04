package ExerciciosFacul.ExerciciosFacul;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Centígrados: ");
        float C = sc.nextFloat();

        float F = ((9 * C) + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit é: %.3f\n", F);

        sc.close();
    }
}
