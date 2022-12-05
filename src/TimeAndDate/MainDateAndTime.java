package TimeAndDate;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.Temporal;
import java.util.Locale;


public class MainDateAndTime {
    public static void WriteDateAndTime() {

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(2022,12,24);
        LocalTime userTime = LocalTime.of(17,00,00,00);
        LocalDateTime userDateTime = LocalDateTime.of(userDate, userTime);


        //System.out.println(nowDateTime.getHour()+":"+ nowDateTime.getMinute()+":"+ nowDateTime.getSecond());

        System.out.print(DateComparing.compareDate(nowDate,userDate)[0]+" years ");
        System.out.print(DateComparing.compareDate(nowDate,userDate)[1]+" months ");
        System.out.println(DateComparing.compareDate(nowDate,userDate)[2]+" days ");
        System.out.println("Left until Christmas ");

    }
}
