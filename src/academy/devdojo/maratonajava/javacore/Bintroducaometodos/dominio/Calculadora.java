package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(12 - 10);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double nu1, double nu2) {
        if (nu2 == 0) {
            return 0;
        }
        return nu1 / nu2;
    }

    //Desafio 1 : Criar uma calculadora que verifica se um número é primo ou não
    //Retorna true se for primo, false se nao for
    public boolean verificaPrimo(int numero) {
        if (numero == 2) {
            return true;
        }
        if (numero <= 1 || (numero % 2) == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }


    //Desafio 2 : Criar uma calculadora que recebe uma lista/ array e retorna a lista com seus valores x 2

    public void CalcularArray(int... numeros) {
        for (int num : numeros) {
            System.out.println(num * 2);
        }

    }

    public void somaVarArgs(int... nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println("Soma: " + soma);

    }
}
