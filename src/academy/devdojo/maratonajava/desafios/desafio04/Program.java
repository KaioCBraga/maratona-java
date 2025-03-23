package academy.devdojo.maratonajava.desafios.desafio04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sucessor = number + 1;
        int antecessor = number - 1;
        System.out.println(sucessor);
        System.out.println(antecessor);
    }
}
