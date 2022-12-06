package TimeAndDate;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

class DateComparing {
    /*
    static Map mapComparingTimeDate(Integer compareDateYear, Integer compareDateMonth, Integer compareDateDays) {

        Map<ChronoUnit, Integer> diffMap = new HashMap<>();
        diffMap.put(ChronoUnit.YEARS, compareDateYear);
        diffMap.put(ChronoUnit.MONTHS, compareDateMonth);
        diffMap.put(ChronoUnit.DAYS, compareDateDays);

        return diffMap;
    }
    */

    static Map mapComparingTimeDate(LocalDate nowDate, LocalDate userDate){

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

    static int compareTime(LocalDate nowTime, LocalDate userTime) {

        Duration duration = Duration.between(nowTime, userTime);
        int differencesTime = 0;
        return differencesTime;
    }
}
