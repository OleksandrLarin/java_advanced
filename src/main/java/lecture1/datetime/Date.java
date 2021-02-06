package lecture1.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Date {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate date = LocalDate.of(2015, 02, 20);

        LocalDate.parse("2015-02-20");

        System.out.println(tomorrow());

//        System.out.println(getDayOfWeek());
//        System.out.println(isNowBefore(LocalDate.now()));
    }


    public static LocalDate tomorrow() {
        return LocalDate.now().plusDays(1);
    }

    public static LocalDate monthAgo() {
        return LocalDate.now().minus(1, ChronoUnit.MONTHS);
    }

    private static DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }

    private static int getDayOfMonth() {
        return LocalDate.now().getDayOfMonth();
    }

    private static boolean isLeapYear() {
        return LocalDate.now().isLeapYear();
    }

    private static boolean isNowBefore(LocalDate date) {
        return LocalDate.now().isBefore(date);
    }

    private static LocalDateTime getStartOfADay() {
        return LocalDate.now().atStartOfDay();
    }

    private static LocalDate getStartOfAMonth() {
        return LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
    }
}
