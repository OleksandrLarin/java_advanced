package lesson9.oop.polimorphism;

public class App {

    private Sender sender;

    public App(Sender sender) {
        this.sender = sender;
    }

    public void sendMessage(String message) {
        sender.send(message);
    }

    public static void main(String[] args) {
        App app;
        if (true) {
            app = new App(new MailSender());
        } else {
            app = new App(new SmsSender());
        }
        app.sendMessage("message");
    }
}
