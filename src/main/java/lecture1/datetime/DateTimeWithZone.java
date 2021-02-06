package lecture1.datetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTimeWithZone {
    private ZoneId zoneId = ZoneId.of("Europe/Paris");

    private Set<String> getAvailableZoneIds() {
        return ZoneId.getAvailableZoneIds();
    }

    private ZonedDateTime convertLocalDateTimeToASpecificZone() {
        return ZonedDateTime.of(LocalDateTime.now(), zoneId);
    }

    /**
     * Другой способ работы с часовым поясом - использовать OffsetDateTime.
     * OffsetDateTime - это неизменное представление даты и времени со смещением.
     * Этот класс хранит все поля даты и времени с точностью до наносекунд, а также смещение от UTC / Гринвича.
     */
    private static OffsetDateTime getOffsetDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.of("+02:00");
        return OffsetDateTime.of(localDateTime, offset);
    }

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now().minusHours(8), ZoneId.of("America/Chicago"));
//        System.out.println(zonedDateTime);
//        DateTimeWithZone dateTimeWithZone = new DateTimeWithZone();
//        System.out.println(dateTimeWithZone.convertLocalDateTimeToASpecificZone());
        System.out.println(getOffsetDateTime());
    }
}
