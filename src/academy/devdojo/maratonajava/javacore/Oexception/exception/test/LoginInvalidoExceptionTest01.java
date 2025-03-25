package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDb = "ddj";
        System.out.println("Usuário");
        String usernamdeDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernamdeDigitado) || !senhaDb.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
