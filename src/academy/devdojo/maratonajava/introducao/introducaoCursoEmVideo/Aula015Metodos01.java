package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

public class Aula015Metodos01 {

    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int sm = soma(5, 2);
        System.out.println("A soma vale " + sm);
    }
}
