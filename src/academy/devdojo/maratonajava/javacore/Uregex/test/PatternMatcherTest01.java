package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaba";
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
