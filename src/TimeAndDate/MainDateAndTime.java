package TimeAndDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate userDate = LocalDate.of(2022,12,24);
        LocalTime userTime = LocalTime.of(8,0,0,0);
        LocalDateTime userDateTime = LocalDateTime.of(userDate, userTime);

        System.out.println(nowDateTime.getHour()+":"+ nowDateTime.getMinute());
        System.out.println(userTime);

        System.out.format("%02d %n", userTime.getHour());

        Map<ChronoUnit, Long> diffMap = new HashMap(DateComparing.mapComparingDateTime(nowDateTime, userDateTime));

        System.out.println("Difference between :");
        System.out.println(nowDateTime);
        System.out.println("To");
        System.out.println(userDateTime);
        System.out.println("Is");
        System.out.println("Years: " + diffMap.get(ChronoUnit.YEARS));
        System.out.println("Months: " + diffMap.get(ChronoUnit.MONTHS));
        System.out.println("Days: " + diffMap.get(ChronoUnit.DAYS));

        System.out.print("Time remaining: " +diffMap.get(ChronoUnit.HOURS));
        System.out.print(":" +diffMap.get(ChronoUnit.MINUTES));
        //System.out.println(":" +diffMap.get(ChronoUnit.SECONDS));
    }
}

