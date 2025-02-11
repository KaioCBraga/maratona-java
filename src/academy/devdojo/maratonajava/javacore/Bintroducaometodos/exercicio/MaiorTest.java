package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class MaiorTest {
    public static void main(String[] args) {
        Estatisticas estatisticas = new Estatisticas();
        double result = estatisticas.encontrarMaior(66, 44, 33, 88, 99, 33, 120);
        System.out.println(result);
    }
}
