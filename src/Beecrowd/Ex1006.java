package Beecrowd;

import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double b = sc.nextDouble();
        
        double c = sc.nextDouble();

        double media = (2 * a + 3 * b + 5 * c) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();
    }
}
