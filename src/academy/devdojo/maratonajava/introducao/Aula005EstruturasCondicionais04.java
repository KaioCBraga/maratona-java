package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais04 {
    public static void main(String[] args) {
        //TABELA VERDADE
        /*
            && Se tudo for verdadeiro = V se não = F
        V && V = V
        V && F = F
        F && V = F
        F && F = F
         */
         /*
            || Se apenas uma for verdadeiro = V se tudo for falso  = F
         V || V = V
         V || F = V
         F || V = V
         F || F = F
         */


        //EXERCICIO
        double salario = 70000;
        double taxa = 9.70;
        if (salario >= 34713 && salario < +68507) {
            taxa = 37.35;
        } else if (salario > 68507) {
            taxa = 49.50;
        }
        double valorPagamentoTaxa = (salario * taxa) / 100;
        System.out.println("O valor de pagamento da sua taxa é de " + valorPagamentoTaxa + " sua taxa é de  " + taxa +
                "%");
    }
}

