package TimeAndDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate userDate = LocalDate.of(2024,6,24);
        LocalTime userTime = LocalTime.of(21,0,0,0);
        LocalDateTime userDateTime = LocalDateTime.of(userDate, userTime);

        System.out.println(nowDateTime.getHour()+":"+ nowDateTime.getMinute()+":"+ nowDateTime.getSecond());

        Map<ChronoUnit, Long> diffMap = new HashMap(DateComparing.mapComparingDateTime(nowDateTime, userDateTime));

        System.out.println("Days: " + diffMap.get(ChronoUnit.DAYS));
        System.out.println("Months: " + diffMap.get(ChronoUnit.MONTHS));
        System.out.println("Years: " + diffMap.get(ChronoUnit.YEARS));

        System.out.println("Hours: " +diffMap.get(ChronoUnit.HOURS));
        System.out.println("Minutes: " +diffMap.get(ChronoUnit.MINUTES));
        System.out.println("Seconds: " +diffMap.get(ChronoUnit.SECONDS));

    }

}

