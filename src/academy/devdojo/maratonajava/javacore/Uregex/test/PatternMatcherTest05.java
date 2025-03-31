package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W =Tudo o que não for incluso no \w
        // []
        // ? = Zero, ou uma
        // * = zero, ou mais
        // + = uma, ou mais
        // {n, m} de n até m
        // () = agrupamento
        // | = o(v|o)o ovo | oco
        // $ = fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.com, teste@gmail.com, sakura@mail";
        System.out.println("#@!zoro@mail.com".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("indice:  0123456789 ");
        System.out.println("regex:   " + regex);
        System.out.println("Posiçoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
