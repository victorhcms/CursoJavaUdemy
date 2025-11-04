package ExerciciosFacul.ExerciciosFacul;

import java.util.Locale;
import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o seu salário atual: R$ ");
        float salario = sc.nextFloat();
        System.out.printf("Digite a porcentagem de reajuste do seu salário: ");
        float percentual = sc.nextFloat();
        
        float novoSalario = salario +  ( salario * percentual / 100);

        System.out.printf("O salário reajustado é: R$ %.3f\n", novoSalario);

        sc.close();
    }
}
