package academy.devdojo.maratonajava.desafios.desafio24;


public class Test {
    public static void main(String[] args) {
        Carro bmw = new Carro(20, 80);
        bmw.calcDistanciaPercorrida(bmw.getHorasViagem(), bmw.getVelocidadeMedia());
        bmw.calcLitrosConsumidos(bmw.getDistanciaPercorrida(), bmw.getCombustivelPorLitro());
        System.out.println(bmw.getDistanciaPercorrida());
        System.out.println(bmw.getLitrosUsados());
    }
}
