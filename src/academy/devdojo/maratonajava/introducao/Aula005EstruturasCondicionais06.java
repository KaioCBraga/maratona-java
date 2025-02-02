package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("DIA INVALIDO");
        }
    }
}
