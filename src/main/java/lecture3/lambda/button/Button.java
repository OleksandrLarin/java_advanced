package lecture3.lambda.button;


public class Button {
    private Event event;

    public void setOnAction(Event event) {
        this.event = event;
    }

    public void onEvent() {
        if (event != null) {
            event.action();
        }
    }
}
