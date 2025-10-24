package ExerciciosCursoJava.Exercicios03;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();

        if (nota >= 6 ) {
            System.err.println("APROVADO");
        }
        else {
            System.out.println("RECUPERAÇÃO");
        }
        sc.close();
    }
}
