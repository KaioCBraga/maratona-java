package academy.devdojo.maratonajava.desafios.desafio07;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite true ou false : ");
        boolean valor1 = scanner.nextBoolean();
        System.out.print("Digite true ou false : ");
        boolean valor2 = scanner.nextBoolean();
        if (valor1 == true && valor2 == true) {
            System.out.println("os dois valores são true");
        } else if (valor1 == false && valor2 == false) {
            System.out.println("os dois valores são false");
        } else {
            System.out.println("os dois valores são diferentes");

        }
    }
}
