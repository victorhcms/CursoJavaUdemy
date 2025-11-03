package ExerciciosFacul.ExerciciosFacul;

import java.util.Locale;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o seu endereço: ");
        String endereco = sc.nextLine();
        System.out.printf("Digite o seu telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Endereço é: " + endereco + " e o seu telefone é: " + telefone);

        sc.close();
    }
}
