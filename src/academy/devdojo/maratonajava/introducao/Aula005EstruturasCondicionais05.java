package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        //Valores que um switch pode receber char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
