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

        //System.out.println(nowDateTime.getHour()+":"+ nowDateTime.getMinute());
        //System.out.println(userTime);
        //System.out.format("%02d %n", userTime.getHour());

        Map<ChronoUnit, Long> diffMap = new HashMap(DateComparing.mapComparingDateTime(nowDateTime, userDateTime));

        System.out.println("Difference between :");
        System.out.print(nowDateTime.getYear() + ".");
        System.out.print(nowDateTime.getMonthValue() + ".");
        System.out.print(nowDateTime.getDayOfMonth() + " / ");
        System.out.format("%02d", nowDateTime.getHour());
        System.out.print(":");
        System.out.print(nowDateTime.getMinute());
        System.out.print(" to ");
        System.out.print(userDateTime.getYear() + ".");
        System.out.print(userDateTime.getMonthValue() + ".");
        System.out.print(userDateTime.getDayOfMonth() + " / ");
        System.out.format("%02d", userDateTime.getHour());
        System.out.print(":");
        System.out.format("%02d %n", userDateTime.getMinute());

        System.out.print("Years: " + diffMap.get(ChronoUnit.YEARS));
        System.out.print(" Months: " + diffMap.get(ChronoUnit.MONTHS));
        System.out.print(" Days: " + diffMap.get(ChronoUnit.DAYS));

        System.out.print(" Time: " +diffMap.get(ChronoUnit.HOURS));
        System.out.println(":" +diffMap.get(ChronoUnit.MINUTES));
        //System.out.println(":" +diffMap.get(ChronoUnit.SECONDS));
    }
}

