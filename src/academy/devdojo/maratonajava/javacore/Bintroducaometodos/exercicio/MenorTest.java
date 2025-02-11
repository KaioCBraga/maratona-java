package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class MenorTest {
    public static void main(String[] args) {
        Estatisticas estatisticas = new Estatisticas();
        double result = estatisticas.encontrarMenor(30, 33, 21, 99, 2, 7, 9);
        System.out.println(result);
    }
}
