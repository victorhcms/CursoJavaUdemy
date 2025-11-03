package ExerciciosFacul.ExerciciosFacul;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");

        int num = sc.nextInt();

        System.out.println("O número digitado é: " + num);

        sc.close();
    }
}
