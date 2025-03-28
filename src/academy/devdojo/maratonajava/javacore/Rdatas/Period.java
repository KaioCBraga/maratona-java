package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;

public class Period {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
    }
}
