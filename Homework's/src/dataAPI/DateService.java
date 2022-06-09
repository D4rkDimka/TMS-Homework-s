package dataAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateService {

    public void displayDayByDate(LocalDate date, LocalTime time) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("\t\t\tDay table");
        System.out.println("===============================");
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonthValue() + " (" + date.getMonth() + ")");
        System.out.println("Year: " + date.getYear());
        System.out.println("DATE: " + date.toString());
        System.out.println("Time:" + time.toString());
        System.out.printf("Today is : " + dayOfWeek.toString());
        System.out.println("\n===============================");
    }

    public void displayDateAfterPeriod(int amountOfDays, LocalDate date) {
        System.out.println("Date now: " + date.toString());
        System.out.println("Date after " + amountOfDays + " days: " + date.plusDays(amountOfDays).toString());
    }
}
