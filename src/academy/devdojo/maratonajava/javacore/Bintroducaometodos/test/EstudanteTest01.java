package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Jota";
        estudante1.sexo = "M";
        estudante1.idade = 33;
        estudante2.nome = "Vasco";
        estudante2.sexo = "I";
        estudante2.idade = 200;

        estudante1.imprime();
        estudante2.imprime();
    }
}
