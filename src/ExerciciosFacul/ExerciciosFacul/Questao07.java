package ExerciciosFacul.ExerciciosFacul;

import java.util.Locale;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a altura do trângulo: ");
        float altura = sc.nextFloat();
        System.out.printf("Digite a base do triângulo: ");
        float base = sc.nextFloat();

        float perimetro = base + altura;
        float area = base * altura;

        System.out.println("O perímetro é: " + perimetro + " e a área é: " + area);
        sc.close();
    }
}
