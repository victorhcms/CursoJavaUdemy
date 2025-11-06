package ExerciciosCursoJava.Exercicios04;

import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int F = sc.nextInt();

        int media = (X + Y) * (Z + F);

        System.out.println("A média dos números é: " + media);

        sc.close();
    }
}
