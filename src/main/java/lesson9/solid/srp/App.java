package lesson9.solid.srp;

public class App {
    private Provider provider;
    private Sender sender;

    public static void main(String[] args) {
        App app = new App(new ConsoleMessageProvider(), new FileMessageSender());
        app.sendMessage();
    }

    public App(Provider provider, Sender sender) {
        this.provider = provider;
        this.sender = sender;
    }

    public void sendMessage() {
        String message = provider.getMessage();

        sender.send(message);
    }
}
