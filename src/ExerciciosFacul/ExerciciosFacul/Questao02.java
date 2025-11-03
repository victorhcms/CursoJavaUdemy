package ExerciciosFacul.ExerciciosFacul;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite dois números: ");

        int num = sc.nextInt();

        int num2 = sc.nextInt();

        int produto = num * num2;

        System.out.println("O produto dos números é: " + produto);
        sc.close();
    }
}
