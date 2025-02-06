package academy.devdojo.maratonajava.introducao.introducaoCursoEmVideo;

import java.util.Scanner;

public class Aula010ProgramaPernas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a)");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 5:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
