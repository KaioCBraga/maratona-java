package academy.devdojo.maratonajava.desafios.desafio17;

public class Program {
    private double temperaturaF;

    public void alterarTemperatura(double temperaturaF) {
        double temperaturaC;
        temperaturaC = (temperaturaF - 32) * 5 / 9;
        System.out.println("Sua temperatura em Celsius é " + temperaturaC + ". E em Fahrenheit é " + temperaturaF);
    }

    public Program(double temperaturaF) {
        this.temperaturaF = temperaturaF;
    }

    public double getTemperaturaF() {
        return temperaturaF;
    }

    public void setTemperaturaF(double temperaturaF) {
        this.temperaturaF = temperaturaF;
    }
}
