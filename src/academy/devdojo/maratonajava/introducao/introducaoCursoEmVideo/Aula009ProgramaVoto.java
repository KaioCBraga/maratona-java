package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

import java.util.Scanner;

public class Aula009ProgramaVoto {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento!");
        int idade = 2025 - t.nextInt();
        if (idade < 16) {
            System.out.println("Você tem " + idade + "anos, logo seu voto não é obrigatório!");
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Você tem " + idade + "anos, logo seu voto é opcional!");
        } else {
            System.out.println("Você tem " + idade + "anos, logo seu voto é obrigatório!");
        }
    }
}
