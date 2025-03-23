package academy.devdojo.maratonajava.desafios.desafio22;

public class Program {
    private int A;
    private int B;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public void calcResto(int A, int B) {
        System.out.println("Eu sou " + A + "sou o quociente");
        System.out.println(A % B + "sou o resto da divisao");
    }
}
