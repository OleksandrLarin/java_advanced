package lesson9.patterns.cor;

public class Event {
    private String event;
    private String eventType;

    public Event(String event, String eventType) {
        this.event = event;
        this.eventType = eventType;
    }

    public String getEvent() {
        return event;
    }

    public String getType() {
        return eventType;
    }
}
