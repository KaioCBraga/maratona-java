package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    //1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
    //2 - Alocado espaço em memória para o objeto da superclasse
    //3 - Cada atributo de superclasse pai é criado e inicializado com valores de fault ou o que for passado
    //4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    //5 - Construtor da superclasse é executado
    //6 - Alocado espaço em memória para o objeto da subclasse
    //7 - Cada atributo de subclasse pai é criado e inicializado com valores de fault ou o que for passado
    //8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    //9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jota");
    }
}
