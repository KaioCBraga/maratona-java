package academy.devdojo.maratonajava.desafios.desafio09;

import java.util.Locale;
import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa("Kaio", 24);
        System.out.print("Digite seu peso: ");
        pessoa1.setPeso(scanner.nextDouble());
        System.out.print("Digite sua altura: ");
        pessoa1.setAltura(scanner.nextDouble());
        pessoa1.calcularIMC();
    }
}
