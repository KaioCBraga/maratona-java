package academy.devdojo.maratonajava.desafios.desafio03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("O valor de C é: " + C);
    }
}
