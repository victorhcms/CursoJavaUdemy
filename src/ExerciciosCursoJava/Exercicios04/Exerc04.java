package ExerciciosCursoJava.Exercicios04;

import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        System.out.println("O valor digitado foi: " + X);
        sc.close();
    }
}
