package academy.devdojo.maratonajava.desafios.desafio06;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor que recebera o incremento de 5%: ");
        double valor = scanner.nextDouble();
        System.out.println("O seu novo valor é  " + valor * 0.05);
    }
}
