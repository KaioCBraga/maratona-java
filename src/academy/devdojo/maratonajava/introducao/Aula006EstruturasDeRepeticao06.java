package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao06 {
    public static void main(String[] args) {
//Exercício: Tabuada e Contagem de Números Pares
//Digite um número inteiro e exiba a tabuada de multiplicação desse número (de 1 a 10).
        int numTabuada = 4;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = i * numTabuada;
            System.out.println(result);
        }
//Digite um intervalo (início e fim) e conte quantos números pares existem nesse intervalo.
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
