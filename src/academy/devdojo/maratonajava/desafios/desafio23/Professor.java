package academy.devdojo.maratonajava.desafios.desafio23;

public class Professor extends Pessoa implements
        Taxa, Salary {

    public Professor(double valorHora, int numAulas) {
        this.valorHora = valorHora;
        this.numAulas = numAulas;
    }


    private double valorHora;
    private int numAulas;
    public final double descontoINSS = 0.05;


    @Override
    public double calcSalary(double valorHora, double numHora) {
        return setSalario(valorHora * numHora);
    }


    @Override
    public double calcINSS(double desconto) {
        desconto = this.salario * this.descontoINSS;
        return setSalario(this.salario - desconto);
    }


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumAulas() {
        return numAulas;
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }
}
