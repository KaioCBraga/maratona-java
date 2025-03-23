package academy.devdojo.maratonajava.desafios.desafio23;

public abstract class Pessoa {
    protected String nome;
    protected double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        this.salario = salario;
        return salario;
    }
}
