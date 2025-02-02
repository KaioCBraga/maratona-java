package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 2000;
        // String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        //String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //String resultado;
        //forma com if-else
       /*
       if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        */

        //forma com operador ternário
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }

}
