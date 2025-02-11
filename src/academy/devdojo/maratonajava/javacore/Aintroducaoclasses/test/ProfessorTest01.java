package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Goku";
        professor.idade = 33;
        professor.sexo = 'M';
        System.out.println("Eu sou o professor " + professor.nome + " e tenho " + professor.idade + " anos, meu sexo " +
                "é " +
                professor.sexo);
    }

}
