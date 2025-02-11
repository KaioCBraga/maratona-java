package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class ContadorPositivoTest {
    public static void main(String[] args) {
        Estatisticas estatisticas = new Estatisticas();
        double result = estatisticas.contarPositivos(2, 3, 4, 6, 0, -1, -12, 12);
        System.out.println(result);
    }
}
