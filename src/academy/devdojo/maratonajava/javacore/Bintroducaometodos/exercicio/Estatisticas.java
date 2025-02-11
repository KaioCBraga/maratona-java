package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio;

public class Estatisticas {
    //001
    public double calcularMedia(double... nuns) {
        double soma = 0;

        for (double n : nuns) {
            soma += n;
        }
        return soma / nuns.length;
    }

    //002
    public double encontrarMaior(double... nuns2) {
        double numMaior = nuns2[0];
        for (int i = 0; i < nuns2.length; i++) {
            if (nuns2[i] > numMaior) {
                numMaior = nuns2[i];
            }
        }
        return numMaior;
    }

    //003
    public double encontrarMenor(double... nuns3) {
        double numMenor = nuns3[0];
        for (int i = 0; i < nuns3.length; i++) {
            if (nuns3[i] < numMenor) {
                numMenor = nuns3[i];
            }
        }
        return numMenor;
    }

    //004
    public double contarPositivos(double... nuns4) {
        double contador = 0;
        for (int i = 0; i < nuns4.length; i++) {
            if (nuns4[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    //005
    public void impressora(double... numeros) {
        System.out.println("Média: " + calcularMedia(numeros));
        System.out.println("Quantidade de positivos: " + contarPositivos(numeros));
        System.out.println("Maior número: " + encontrarMaior(numeros));
        System.out.println("Menor número: " + encontrarMenor(numeros));
    }
}
