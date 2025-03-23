package academy.devdojo.maratonajava.desafios.desafio13;

public class Pessoa implements verificadorIdade {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String calcularIdade(double idade) {
        return idade >= 18 ? "anos. Você é maior de idade " : "anos. Você é menor de idade";
    }


    @Override
    public String toString() {
        return "Olá " + nome + ", sua idade é  " + idade + calcularIdade(idade);
    }
}
