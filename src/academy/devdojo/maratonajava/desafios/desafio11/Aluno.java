package academy.devdojo.maratonajava.desafios.desafio11;

public class Aluno extends Pessoa {
    public Aluno(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    Nota[] notas = new Nota[4];
    private int media;


    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    public void getMedia(int media) {
        this.media = media;


    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

}
