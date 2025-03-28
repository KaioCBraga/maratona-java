package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-08-06T09:45:21.123456789", DateTimeFormatter.ISO_DATE_TIME);


        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = date.format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("06/08/2022", formatterBR);
        System.out.println(parseBR);
        

    }
}
