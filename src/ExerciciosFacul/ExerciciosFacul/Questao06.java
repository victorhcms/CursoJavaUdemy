package ExerciciosFacul.ExerciciosFacul;

import java.util.Locale;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o saldo atual da conta:");

        int saldo = sc.nextInt();

        int novoSaldo = saldo + (saldo * 2 / 100);

        System.out.println("O novo saldo é: " + novoSaldo);

        sc.close();
    }
}
