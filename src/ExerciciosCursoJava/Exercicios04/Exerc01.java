package ExerciciosCursoJava.Exercicios04;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INICIANDO A CONTAGEM");
        
        for (int i=100; i>= 0; i--) {
            System.out.println("Contagem regresiva: " + i);
        }

        sc.close();
    }
}
