package academy.devdojo.maratonajava.javacore.Gassociacao.desafio;

public class Test01 {
    public static void main(String[] args) {
        // Criar e configurar o seminário completamente primeiro
        Seminario seminarEnglish = new Seminario();
        Aluno aluno1 = new Aluno("kaio", 24);
        Aluno aluno2 = new Aluno("maria", 23);
        Aluno[] alunos = {aluno1, aluno2};
        Professor professor1 = new Professor("David", "English-Advanced");
        Professor professor2 = new Professor("Ricardo", "English-Basic");
        Professor[] professors = {professor1, professor2};

        // Configurar o seminário
        seminarEnglish.setProfessores(professors);
        seminarEnglish.setAlunos(alunos);
        seminarEnglish.setTitulo("Seminario-English");
        seminarEnglish.setLocal("Vitoria-ES");

        // Agora criar o array e associar aos professores
        Seminario[] seminarios = {seminarEnglish};
        professor1.setSeminarios(seminarios);
        professor2.setSeminarios(seminarios);

        // Associar o seminário aos alunos (como String, conforme você especificou)
        aluno1.setSeminario(seminarEnglish.getTitulo());
        aluno2.setSeminario(seminarEnglish.getTitulo());

        // Imprimir resultados
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(seminarEnglish);
    }
}