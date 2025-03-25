package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
