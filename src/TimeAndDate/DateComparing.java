package TimeAndDate;
import java.time.LocalDate;
import java.time.Period;

class DateComparing{
    static int compareDay(LocalDate nowDate, LocalDate userDate){
        int compareDay= userDate.compareTo (nowDate);
        return compareDay;
    }

     static int[] compareDate (LocalDate nowDate, LocalDate userDate){

        Period period = Period.between(nowDate, userDate);

        int diffYears = Math.abs(period.getYears());
        int diffMonth = Math.abs(period.getMonths());
        int diffDays = Math.abs(period.getDays());

        int[] differencesData={diffYears,diffMonth,diffDays};

        return differencesData;
    }
}
