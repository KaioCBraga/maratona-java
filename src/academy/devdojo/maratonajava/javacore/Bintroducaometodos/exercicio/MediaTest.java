package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class MediaTest {
    public static void main(String[] args) {
        Estatisticas estatisticas = new Estatisticas();
        double result = estatisticas.calcularMedia(40, 10, 15);
        System.out.println(result);
    }
}
