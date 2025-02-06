package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

import java.util.Arrays;

public class Aula014Arrays04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição" + p);
    }
}
