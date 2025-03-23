package academy.devdojo.maratonajava.desafios.desafio13;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa("Kaio", 18);
        System.out.println(pessoa1);
        scanner.close();
    }
}
