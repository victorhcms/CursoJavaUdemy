package ExerciciosCursoJava.Exercicios03;

import java.util.Scanner;

public class Exec05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        sc.close();
    }
}