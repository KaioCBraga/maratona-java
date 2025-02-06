package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

import java.util.Scanner;

public class Aula008ProgramaCalcularIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano deu seu nascimento");
        int nasc = teclado.nextInt();
        float idade = (2025 - nasc);
        System.out.println(idade);
        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos, então você é de maior!");
        } else {
            System.out.println("Você tem " + idade + " anos, então você é de menor!");
        }
    }
}
