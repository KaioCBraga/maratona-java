package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

import java.util.Scanner;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f", nome, nota);
    }
}

