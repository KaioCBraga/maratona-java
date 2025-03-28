package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        Instant nowIntant = Instant.now();
        System.out.println(nowIntant);
        ZonedDateTime zonedDateTime2 = nowIntant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
    }
}
