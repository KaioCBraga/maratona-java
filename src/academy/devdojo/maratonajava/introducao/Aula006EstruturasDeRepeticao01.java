package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao01 {
    public static void main(String[] args) {
//while, do while, for. Essas são as estruturas de repetição
        //forma WHILE
        int count = 0;
        while (count <= 10) {
            System.out.println("Oi eu sou o FOR" + count);
            count++;
        }
        //forma DO-WHILE
        int dow = 1;
        do {
            System.out.println("Oi eu sou o DOWHILE" + dow);
            dow++;
        } while (dow <= 10);
        //forma FOR
        for (int i = 1; i <= 10; i++) {
            System.out.println("Oi eu sou o FOR" + i);
        }
    }
}
