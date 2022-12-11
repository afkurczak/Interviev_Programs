package TimeAndDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate userDate = LocalDate.of(2022,2,9);
        LocalTime userTime = LocalTime.of(8,0,0,0);
        LocalDateTime userDateTime = LocalDateTime.of(userDate, userTime);

        Map<ChronoUnit, Long> diffMap = new HashMap(DateComparing.mapComparingDateTime(nowDateTime, userDateTime));

        System.out.println("Difference between :");
        System.out.print(nowDateTime.getYear() + ".");
        System.out.print(nowDateTime.getMonthValue() + ".");
        System.out.format("%02d", nowDateTime.getDayOfMonth());
        System.out.print(" / ");
        System.out.format("%02d", nowDateTime.getHour());
        System.out.print(":");
        System.out.format("%02d", nowDateTime.getMinute());
        System.out.print(" to ");
        System.out.format("%02d", userDateTime.getYear());
        System.out.print(".");
        System.out.format("%02d", userDateTime.getMonthValue());
        System.out.print(".");
        System.out.format("%02d", userDateTime.getDayOfMonth());
        System.out.print(" / ");
        System.out.format("%02d", userDateTime.getHour());
        System.out.print(":");
        System.out.format("%02d %n", userDateTime.getMinute());


        System.out.format("%02d", diffMap.get(ChronoUnit.YEARS));
        System.out.print(" Years / ");
        System.out.format("%02d", diffMap.get(ChronoUnit.MONTHS));
        System.out.print(" Months / ");
        System.out.format("%02d", diffMap.get(ChronoUnit.DAYS));
        System.out.print(" Days");
        System.out.print(" | Time: ");
        System.out.format("%02d", diffMap.get(ChronoUnit.HOURS));
        System.out.print(":");
        System.out.format("%02d %n", diffMap.get(ChronoUnit.MINUTES));

    }
}

