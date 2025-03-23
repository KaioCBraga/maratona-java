package academy.devdojo.maratonajava.desafios.desafio20;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Tabuada tabuada1 = new Tabuada(scanner.nextInt());
        tabuada1.calcTabuada(tabuada1.getNumber());
    }
}
