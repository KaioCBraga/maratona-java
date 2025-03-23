package academy.devdojo.maratonajava.desafios.desafio10;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota");
        int nota1 = scanner.nextInt();
        System.out.print("Digite sua segunda nota");
        int nota2 = scanner.nextInt();
        System.out.print("Digite sua terceira nota");
        int nota3 = scanner.nextInt();
        int[] notas = {nota1, nota2, nota3};
        int medianotastotal = 0;
        for (int i = 0; i < notas.length; i++) {
            medianotastotal += notas[i];
        }
        double media = medianotastotal / notas.length;
        System.out.println("Sua media é de " + media);
        scanner.close();
    }
}
