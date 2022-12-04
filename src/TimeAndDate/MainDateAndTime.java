package TimeAndDate;
import java.time.*;
import java.time.temporal.Temporal;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalTime nowTime = LocalTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalTime userTime = LocalTime.of(17,0,0);
        LocalDate userDate = LocalDate.of(2022,12,24);
        System.out.println(nowTime.getHour());
        System.out.println(userTime.getHour());
        System.out.println(nowDate);
        System.out.println(userDate);

        //Temporal tempNowDate = nowDate.adjustInto(tempNowDate);

        System.out.println(DateComparing.compareDate(nowDate.with(nowDate), userDate.with(userDate)));


    }
}
