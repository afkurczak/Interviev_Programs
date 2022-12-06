package TimeAndDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(2022,12,24);
        LocalTime userTime = LocalTime.of(17,0,0,0);
        LocalDateTime userDateTime = LocalDateTime.of(userDate, userTime);

        System.out.println(nowDateTime.getHour()+":"+ nowDateTime.getMinute()+":"+ nowDateTime.getSecond());

        Map<ChronoUnit, Integer> diffMap = new HashMap(DateComparing.mapComparingDate(nowDate, userDate));

        System.out.println("Days: " + diffMap.get(ChronoUnit.DAYS));
        System.out.println("Months: " + diffMap.get(ChronoUnit.MONTHS));
        System.out.println("Years: " + diffMap.get(ChronoUnit.YEARS));
    }

}

