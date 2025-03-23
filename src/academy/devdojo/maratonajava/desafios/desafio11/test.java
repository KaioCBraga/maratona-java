package academy.devdojo.maratonajava.desafios.desafio11;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno("Kaio", "masculino", 24);
        Nota notas1 = new Nota();
        Nota notas2 = new Nota();
        Nota notas3 = new Nota();
        Nota notas4 = new Nota();
        Nota[] notas = {notas1, notas2, notas3, notas4};
        int notasTotal = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite sua nota: ");
            notas[i].setNota(scanner.nextInt());
            notasTotal += notas[i].getNota();
        }

        aluno1.setMedia(notasTotal / notas.length);
        if (aluno1.getMedia() >= 7) {
            System.out.println("Média do aluno: " + aluno1.getMedia() + " Você foi aprovado");
        } else {
            System.out.println("Média do aluno: " + aluno1.getMedia() + "  Você foi reprovado");
        }
    }
}
