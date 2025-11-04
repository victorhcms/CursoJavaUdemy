package ExerciciosFacul.ExerciciosFacul;

import java.util.Locale;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual foi o tempo percorrido? ");
        float T = sc.nextFloat();

        System.out.print("Qual foi a velocidade média da viagem? ");
        float V = sc.nextFloat();

        float D = T * V;
        float L = D / 12;

        System.out.println("A distância percorrido foi de: " + D + " KM/H" + " e a quantidade de litros consumidos durante a viagem foi de: " + L + "L");

        sc.close();
    }
}
