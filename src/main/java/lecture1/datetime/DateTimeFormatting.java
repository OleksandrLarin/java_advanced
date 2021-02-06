package lecture1.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.MAY, 25, 6, 30);
        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);

        System.out.println(localDateString); // 2015-01-25
        System.out.println(
                //2015/01/25
                localDateTime.format(DateTimeFormatter.ofPattern("MM*dd*yyyy"))
        );
    }
}
