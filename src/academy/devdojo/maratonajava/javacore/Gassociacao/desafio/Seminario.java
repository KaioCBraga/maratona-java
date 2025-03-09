package academy.devdojo.maratonajava.javacore.Gassociacao.desafio;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private String local;
    private Aluno[] alunos;
    private Professor[] professores;

    public Seminario() {
    }

    public Seminario(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", local='" + local + '\'' +
                ", alunos=" + Arrays.toString(alunos) +
                ", professores=" + Arrays.toString(professores) +
                '}';
    }
}
