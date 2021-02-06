package lecture1.datetime;

import java.time.LocalTime;

public class Time {
    private static LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    private static LocalTime parseTime() {
        return LocalTime.parse("06:30");
    }

    private static LocalTime parseTimeOf() {
        return LocalTime.of(1, 59, 45);
    }

    private static LocalTime timePlusHour() {
        return LocalTime.now().plusHours(10);
    }

    private static int getHour() {
        return LocalTime.now().getHour();
    }

    private static boolean isBefore(LocalTime localTime) {
        return LocalTime.now().isBefore(localTime);
    }


    public static void main(String[] args) {
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        LocalTime midnight = LocalTime.MIDNIGHT;

    }
}
