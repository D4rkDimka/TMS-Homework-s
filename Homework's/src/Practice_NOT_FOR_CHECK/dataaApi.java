package Practice_NOT_FOR_CHECK;

import java.time.LocalDate;
import java.time.LocalTime;

public class dataaApi {
    void getDate()
    {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());;
        System.out.println(date.getDayOfMonth());
        System.out.println(date.plusDays(2));
        System.out.println(date.atStartOfDay());;
        System.out.println(date.getEra());;
        System.out.println(date.toEpochDay());;
    }

}
