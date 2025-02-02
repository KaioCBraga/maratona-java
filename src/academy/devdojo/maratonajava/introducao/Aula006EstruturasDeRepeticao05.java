package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //Condição valorParcela >= 1000
        int carro = 25000;
        int valorParcela = 1000;
        for (int i = 1; i <= 1000; i++) {


            if (i * valorParcela == carro) {

                System.out.println("O número de parcelas sera de " + i + " no valor de " + valorParcela + "R$");
                break;
            }
        }
    }
}
