package lecture1.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
    private LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    private LocalDateTime getLocalDateTimeOf() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.now());
    }

    private LocalDateTime localDateTimeOf() {
        return LocalDateTime.of(2021, Month.JANUARY, 1, 6, 30);
    }

    private LocalDateTime parseLocalDateTime() {
        return LocalDateTime.parse("2021-01-01T06:30:00");
    }

    public static void main(String[] args) {
    }
}
