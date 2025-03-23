package academy.devdojo.maratonajava.desafios.desafio08;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero : ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite outro numero : ");
        int valor2 = scanner.nextInt();
        System.out.print("Digite outro  numero : ");
        int valor3 = scanner.nextInt();
        Integer[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores, Collections.reverseOrder());

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
