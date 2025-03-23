package academy.devdojo.maratonajava.desafios.desafio02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número");
        int numeroEscolhido = sc.nextInt();
        if (numeroEscolhido > 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("O numero é negativo");

        }
        if (numeroEscolhido / 2 == 0) {
            System.out.println("O numero é par");

        } else {
            System.out.println("O numero é impar");

        }

    }
}
