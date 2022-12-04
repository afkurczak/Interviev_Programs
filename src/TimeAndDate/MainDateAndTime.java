package TimeAndDate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class MainDateAndTime {
    public static void WriteDateAndTime() {
        Instant instant = Instant.now();
        System.out.println(ZonedDateTime.now(ZoneId.of( "UTC+1" )).toString());

        System.out.println(instant);
    }
}
