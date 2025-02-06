package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

import java.util.Arrays;

public class Aula014Arrays03 {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v); // coloca o vetor em ordem
        for (double valor : v) {
            System.out.println(valor + "");
        }
    }
}
