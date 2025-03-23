package academy.devdojo.maratonajava.desafios.desafio05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salario minimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite o seu salario: ");
        double salarioAtual = scanner.nextDouble();
        double salariosGanhos = salarioAtual / salarioMinimo;
        System.out.println("Vocé recebe " + salariosGanhos + "salarios minimos");
    }
}
