package TimeAndDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

class DateComparing {

    static Map mapComparingDateTime(LocalDateTime nowDateTime, LocalDateTime userDateTime){

        LocalDate nowDate = nowDateTime.toLocalDate();
        LocalDate userDate = userDateTime.toLocalDate();

        Period period = Period.between(nowDate, userDate);
        Duration duration = Duration.between(nowDateTime, userDateTime);

        Integer diffYearsInt = Math.abs(period.getYears());
        Integer diffMonthInt = Math.abs(period.getMonths());
        Integer diffDaysInt = Math.abs(period.getDays());

        long diffYears = diffYearsInt.longValue();
        long diffMonth = diffMonthInt.longValue();
        long diffDays = diffDaysInt.longValue();

        long diffHours = Math.abs(duration.toHours());
        long diffMinutes = Math.abs(duration.toMinutes());
        long diffSeconds = Math.abs(duration.toHours());

        Map <ChronoUnit, Long> diffMap = new HashMap<>();
        diffMap.put(ChronoUnit.YEARS, diffYears);
        diffMap.put(ChronoUnit.MONTHS, diffMonth);
        diffMap.put(ChronoUnit.DAYS, diffDays);

        diffMap.put(ChronoUnit.HOURS, diffHours);
        diffMap.put(ChronoUnit.MINUTES, diffMinutes);
        diffMap.put(ChronoUnit.SECONDS, diffSeconds);

        return diffMap;
    }
}
