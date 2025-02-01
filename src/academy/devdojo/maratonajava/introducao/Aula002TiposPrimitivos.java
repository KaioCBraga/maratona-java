package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000L; //número inteiro
        long numeroGrande = (long) 100000; //números inteiros grandes
        double salarioDouble = 2000; // números de ponto flutuante com precisão dupla
        float salarioFloat = (float) 2500; // números decimais de ponto flutuante
        byte idadeByte = 10; //representa um número inteiro de 8bits
        short idadeShort = 10; //reperenta um número inteiro de 16bits
        boolean verdadeiro = true; //um tipo de dado que pode ter apenas dois tipos true ou false
        boolean falso = false;//um tipo de dado que pode ter apenas dois tipos true ou false
        char caractere = '\u0041'; // tipo primitivo que representa um caractere único
        System.out.println("A idade é "+idade+ " anos");
        String nome = "Eu me chamo Kaio, estou muito focado";
        System.out.println(nome);
    }
}
