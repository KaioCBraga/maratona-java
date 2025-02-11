package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Kaio";
        funcionario.idade = 24;
        funcionario.salarios = new double[]{2000, 3000, 2500};
        funcionario.imprime();
    }
}
