package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays02 {
    public static void main(String[] args) {
        //tipos primitivos declarando arrays vazias retorna =
        //byte, short, int, long, float e double retorna  0
        // char '\u0000' ' ' retorna um valor em branco
        // boolean retorna false
        // String retorna null
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Gohan";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
