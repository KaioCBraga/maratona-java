package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9, 45, 21);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);
    }
}
