package lecture1.formatter;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class StringFormatter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        System.out.println(formatter.format("%3$s %1$s %2$s", "World", "!", "Hello"));

        String text = "%3$s - означает выделение значимой информации и исключение из рассмотрения незначимой. " +
                "%2$s - свойство системы, позволяющее объединить данные и методы в классе. " +
                "%1$s - свойство системы, позволяющее описать новый класс на основе уже существующего с частично или полностью заимствующейся функциональностью. " +
                "%4$s - свойство системы использовать объекты с одинаковым интерфейсом без информации о типе и внутренней структуре объекта.";

        System.out.println(formatter.format(text, "Наследовани", "Инкапсуляция", "Абстракция", "Полиморфизм"));
        System.out.println(String.format(text, "Наследовани", "Инкапсуляция", "Абстракция", "Полиморфизм"));

        Calendar calendar = new GregorianCalendar(2021, Calendar.MAY, 10);

        System.out.println(String.format("The date is: %tm %1$te, %1$tY", calendar));
    }

}
