package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        String regex = "\\D";
        String texto = "hhj212gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("indice:  0123456789 ");
        System.out.println("regex:   " + regex);
        System.out.println("Posiçoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " ");
        }
    }
}
