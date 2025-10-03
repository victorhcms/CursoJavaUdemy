package ExerciciosCursoJava.Exercicios02;

import java.util.Locale;
import java.util.Scanner;

public class Exe05 {   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();

        int quant = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quant * 4.00;
        }
        else if (codigo == 2) {
            total = quant * 4.50;
        }
        else if (codigo == 3) {
            total = quant * 5.0;
        }
        else if (codigo == 4) {
            total = quant * 2.00;
        }
        else {
            total = quant * 1.5;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);
        sc.close();
    }
}
