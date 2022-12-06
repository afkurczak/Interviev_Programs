package TimeAndDate;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

class DateComparing {

    static Map mapComparingDate(LocalDate nowDate, LocalDate userDate){

        Period period = Period.between(nowDate, userDate);
        int diffYears = Math.abs(period.getYears());
        int diffMonth = Math.abs(period.getMonths());
        int diffDays = Math.abs(period.getDays());

        Map <ChronoUnit, Integer> diffMap = new HashMap<>();
        diffMap.put(ChronoUnit.YEARS, diffYears);
        diffMap.put(ChronoUnit.MONTHS, diffMonth);
        diffMap.put(ChronoUnit.DAYS, diffDays);

        return diffMap;
    }

    static Map mapComparingTime(LocalDateTime nowTime, LocalDateTime userTime) {

        Duration duration = Duration.between(nowTime, userTime);
        long diffHours = Math.abs(duration.toHours());
        long diffMinutes = Math.abs(duration.toMinutes());
        //long diffSeconds = Math.abs(duration.toSeconds());

        Map <ChronoUnit, Long> diffMap = new HashMap<>();
        diffMap.put(ChronoUnit.HOURS, diffHours);
        diffMap.put(ChronoUnit.MINUTES, diffMinutes);
        //diffMap.put(ChronoUnit.SECONDS, diffSeconds);

        return diffMap;
    }
}
