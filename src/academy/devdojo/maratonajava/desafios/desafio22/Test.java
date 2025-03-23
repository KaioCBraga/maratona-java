package academy.devdojo.maratonajava.desafios.desafio22;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Program program = new Program();
        System.out.print("Digite o quociente: ");
        program.setA(scanner.nextInt());
        System.out.print("Digite o dividendo: ");
        program.setB(scanner.nextInt());
        program.calcResto(program.getA(), program.getB());
    }
}
