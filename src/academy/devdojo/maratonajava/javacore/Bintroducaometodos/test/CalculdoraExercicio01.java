package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

//01
public class CalculdoraExercicio01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        boolean result = calculadora.verificaPrimo(2);
        System.out.println(result);
    }
}
