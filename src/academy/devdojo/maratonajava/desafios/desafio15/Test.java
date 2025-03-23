package academy.devdojo.maratonajava.desafios.desafio15;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {

        Pessoa kaio = new Pessoa(2000, 2025, 22, 2);

        System.out.println(kaio.getAnoVida() + " anos, " + kaio.getMesesAtual() + " meses e " + kaio.getDiasAtual() + "dias de vida");
    }

}
