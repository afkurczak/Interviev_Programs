package TimeAndDate;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.Temporal;

class DateComparing{
    static int compareDay(LocalDate nowDate, LocalDate userDate){
        int compareDay= userDate.compareTo (nowDate);
        return compareDay;
    }

     static Duration compareDate ( LocalDate newDate, LocalDate userDate){
        Temporal tempNewDate = newDate.adjustInto(newDate);
        Temporal tempUserDate = userDate.adjustInto(userDate);

        Duration compareData = Duration.between(tempNewDate, tempUserDate);

        return compareData;
    }

}
