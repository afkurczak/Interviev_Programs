package TimeAndDate;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class MainDateAndTime {
    public static void WriteDateAndTime() {
        GettingDate.gettingDate();

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        //Instant instant = Instant.now();
        //System.out.println(ZonedDateTime.now(ZoneId.of( "UTC+1" )).toString());
        //System.out.println(ZonedDateTime.now(SimpleDateFormat("YYYY.MM.DD-HH.MM.SS")));
        //System.out.println(instant);
    }
}
