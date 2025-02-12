package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kaio");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{2000, 2500, 2800});
        funcionario.imprime();
    }
}
