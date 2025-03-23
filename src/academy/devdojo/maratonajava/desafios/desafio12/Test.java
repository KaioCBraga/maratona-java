package academy.devdojo.maratonajava.desafios.desafio12;


public class Test {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Controle", 100, TipoPagamento.CARTAO_PARCELADO3);
        produto1.valorPagar(produto1.getValor());
        System.out.println(produto1);
    }
}
