package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kaio");
        pessoa.setIdade(24);
        pessoa.imprime();
    }
}
