package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

public class Aula003OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (float) (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);

        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);

        float x = 4.6f;
        x += 2;

        System.out.println(Math.floor(x));
    }
}
