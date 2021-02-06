package lecture1.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class DateTimePeriod {

    private LocalDate addPeriod() {
        return LocalDate.now().plus(Period.ofDays(5));
    }

    private int getDayDifference() {
        LocalDate startDate = LocalDate.parse("2021-01-01");
        LocalDate endDate = LocalDate.parse("2021-02-05");
//        LocalDate currentDate = LocalDate.now();
        return Period.between(startDate, endDate).getDays();
    }

    public static void main(String[] args) {
        DateTimePeriod dateTimePeriod = new DateTimePeriod();
        System.out.println(dateTimePeriod.getDayDifference());
    }
}
