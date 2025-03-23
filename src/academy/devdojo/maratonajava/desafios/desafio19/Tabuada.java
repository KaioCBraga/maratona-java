package academy.devdojo.maratonajava.desafios.desafio19;

public class Tabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("tabuada de " + i + " : ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
                if (j == 10) {
                    System.out.println();
                }
            }
        }
    }
}
