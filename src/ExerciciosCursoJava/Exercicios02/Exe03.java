package ExerciciosCursoJava.Exercicios02;

import java.util.Scanner;
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/
public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A / B == 2){
            System.out.println("SÃO MULTIPLOS");
        }
        else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }
        sc.close();
    }
}
