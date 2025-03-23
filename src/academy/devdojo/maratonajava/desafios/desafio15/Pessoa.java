package academy.devdojo.maratonajava.desafios.desafio15;

public class Pessoa {
    private int anoAtual = 2025;
    private int anoNascimento = 2000;
    private int anoVida = anoAtual - anoNascimento - 1;
    private int diasAtual = 22;
    private int mesesAtual = 2;

    public Pessoa(int anoAtual, int anoNascimento, int diasAtual, int mesesAtual) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
        this.diasAtual = diasAtual;
        this.mesesAtual = mesesAtual;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAnoVida() {
        return anoVida;
    }

    public void setAnoVida(int anoVida) {
        this.anoVida = anoVida;
    }


    @Override
    public String toString() {
        return "Pessoa{" + "anoAtual=" + anoAtual + ", anoNascimento=" + anoNascimento + ", anoVida=" + anoVida + ", diasAtual=" + diasAtual + ", mesesAtual=" + mesesAtual + '}';
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getDiasAtual() {
        return diasAtual;
    }

    public void setDiasAtual(int diasAtual) {
        this.diasAtual = diasAtual;
    }

    public int getMesesAtual() {
        return mesesAtual;
    }

    public void setMesesAtual(int mesesAtual) {
        this.mesesAtual = mesesAtual;
    }
}
