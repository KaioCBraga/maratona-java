package academy.devdojo.maratonajava.introducao;

public class Aula004Operadores {

    //Operadores Aritiméticos
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

//        + = soma
        System.out.println("A soma de 10 + 20 é = " + (num1 + num2));
//        - = subtração
        System.out.println("A subtração de 10 - 20 é = " + (num1 - num2));
//        / = divisão
        System.out.println("A divisão de 10 por 20 é = " + (num2 / num1));
//        * = multiplicação
        System.out.println("A multiplicação de 10 por 20 é = " + (num1 * num2));
//        % = resto
        System.out.println("O resto de  10 por 20 é = " + (10 % 2));

        //Operadores relacionais
        boolean isDezMaiorQueVinte = 10 > 20; // > maior
        System.out.println("Dez é maior que Vinte ?" + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20; // < menor
        System.out.println("Dez é menor que Vinte ?" + isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20; // == igual
        System.out.println("Dez é igual a Vinte ?" + isDezIgualVinte);
        boolean isDezDiferenteVinte = 10 != 20; // != diferente
        System.out.println("Dez é diferente de Vinte?" + isDezDiferenteVinte);


        int idade = 35;
        float salario = 3500F;

        //Operadores Lógicos

        // && (AND) indica se dois operandos são verdadeiros
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println("isDentroDaLeiMaiorQueTrinta?" + isDentroDaLeiMaiorQueTrinta);

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta?" + isDentroDaLeiMenorQueTrinta);

        // || (OU) é um operador binário que indica uma disjunção

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel =
                valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel?" + isPlaystationCincoCompravel);

        //Operadores de Atribuição
        double bonus = 1000;
        // +=  incrementando o operando esquerdo
        bonus += 200;
        System.out.println(bonus);
        // -=  decrementando o operando esquerdo
        bonus -= 200;
        System.out.println(bonus);
        // *= multiplicando o operando esquerdo
        bonus *= 10;
        System.out.println(bonus);
        // /=  dividindo o operando esquerdo
        bonus /= 5;
        System.out.println(bonus);
        // %= Atribuição com módulo
        bonus %= 2;
        System.out.println(bonus);

        // ++ , --
        int contador = 0;
        contador++; //incrementa 1 ao valor de contador
        contador--; //decrementa 1 ao valor de contador
        System.out.println(contador);
    }
}
