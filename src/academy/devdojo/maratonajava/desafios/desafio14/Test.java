package academy.devdojo.maratonajava.desafios.desafio14;

public class Test {
    public static void main(String[] args) {
        Valor valor1 = new Valor();
        valor1.setValo_one(20);
        valor1.setValo_two(10);
        System.out.println(valor1);
        valor1.trocaValor(valor1.getValo_one(), valor1.getValo_two());
        System.out.println(valor1);
    }
}
