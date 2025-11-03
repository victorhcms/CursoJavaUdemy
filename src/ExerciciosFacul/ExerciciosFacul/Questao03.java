package ExerciciosFacul.ExerciciosFacul;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");

        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int media = (num + num2 + num3) / 3;

        System.out.println("A média entre os números é: " + media);


        sc.close();
    }
}
