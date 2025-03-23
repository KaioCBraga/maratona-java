package academy.devdojo.maratonajava.desafios.desafio23;

public class Test {
    public static void main(String[] args) {
        Professor professor = new Professor(10, 100);
        professor.setSalario(professor.calcSalary(professor.getValorHora(), professor.getNumAulas()));
        professor.calcINSS(professor.getSalario());
        System.out.println(professor.salario);
    }
}
