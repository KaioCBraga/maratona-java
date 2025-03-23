package academy.devdojo.maratonajava.desafios.desafio18;

public class Test {
    public static void main(String[] args) {


        Pessoa Francisco = new Pessoa("Francisco", 1.50);
        Pessoa Sara = new Pessoa("Sara", 1.10);
        int anos = 0;
        while (Sara.getAltura() <= Francisco.getAltura()) {
            Sara.implementar(0.03);
            Francisco.implementar(0.02);
            anos++;
        }
        System.out.println(anos);
    }
}
