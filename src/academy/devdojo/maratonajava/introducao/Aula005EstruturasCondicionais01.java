package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args) {
        //Estrutura IF (se)
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

    }
}
