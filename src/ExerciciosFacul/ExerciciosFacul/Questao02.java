package ExerciciosFacul.ExerciciosFacul;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");

        int num = sc.nextInt();

        int sucessor = num + 1;

        int antecessor = num - 1;

        System.out.println("O número digitado é: " + num);
        System.out.println("Seu sucessor é: " + sucessor);
        System.out.println("Seu antecessor é: "  + antecessor);

        sc.close();
    }
}
