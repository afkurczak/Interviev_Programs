package TimeAndDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(2024,6,24);
        LocalTime userTime = LocalTime.of(17,0,0,0);
        LocalDateTime userDateTime = LocalDateTime.of(userDate, userTime);

        System.out.println(nowDateTime.getHour()+":"+ nowDateTime.getMinute()+":"+ nowDateTime.getSecond());

        Map<ChronoUnit, Integer> diffMapDate = new HashMap(DateComparing.mapComparingDate(nowDate, userDate));
        Map<ChronoUnit, Long> diffMapTime = new HashMap(DateComparing.mapComparingTime(nowDateTime, userDateTime));

        System.out.println("Days: " + diffMapDate.get(ChronoUnit.DAYS));
        System.out.println("Months: " + diffMapDate.get(ChronoUnit.MONTHS));
        System.out.println("Years: " + diffMapDate.get(ChronoUnit.YEARS));

        System.out.println("Hours: " +diffMapTime.get(ChronoUnit.HOURS));
    }

}

