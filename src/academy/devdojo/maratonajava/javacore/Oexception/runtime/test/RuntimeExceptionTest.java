package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}