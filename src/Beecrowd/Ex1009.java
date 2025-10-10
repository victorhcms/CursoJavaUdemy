package Beecrowd;

import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();

        double salarioFixo = sc.nextDouble();

        double vendasTotais = sc.nextDouble();

        double comissao = vendasTotais * 0.15;

        double salarioTotal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        sc.close();
    }
}
