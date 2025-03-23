package academy.devdojo.maratonajava.desafios.desafio24;

public class Carro {
    private final double combustivelPorLitro = 12;
    private double horasViagem;
    private int velocidadeMedia;
    private double distanciaPercorrida;
    private double litrosUsados;

    public Carro(double horasViagem, int velocidadeMedia) {
        this.horasViagem = horasViagem;
        this.velocidadeMedia = velocidadeMedia;
    }

    public double getCombustivelPorLitro() {
        return combustivelPorLitro;
    }

    public double getHorasViagem() {
        return horasViagem;
    }

    public void setHorasViagem(double horasViagem) {
        this.horasViagem = horasViagem;
    }

    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(int velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getLitrosUsados() {
        return litrosUsados;
    }

    public void setLitrosUsados(double litrosUsados) {
        this.litrosUsados = litrosUsados;
    }

    public void calcDistanciaPercorrida(double horasViagem, int velocidadeMedia) {
        this.distanciaPercorrida = horasViagem * velocidadeMedia;
    }

    public void calcLitrosConsumidos(double distanciaPercorrida, double combustivelPorLitro) {
        this.litrosUsados = distanciaPercorrida / combustivelPorLitro;
    }
}
