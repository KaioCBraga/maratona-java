package academy.devdojo.maratonajava.javacore.Gassociacao.desafio;

public class Aluno {
    private String nome;
    private int idade;
    private String seminario;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, String seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
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

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }


}
