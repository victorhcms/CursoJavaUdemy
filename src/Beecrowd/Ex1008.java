package Beecrowd;

import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDoFuncionario = sc.nextInt();
        
        int horasTrabalhadas = sc.nextInt();

        float valorPorHora = sc.nextFloat();

        float calculoSalario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroDoFuncionario);

        System.out.printf("SALARY = U$ %.2f\n", calculoSalario);

        sc.close();
    }
}
