package lesson9.solid.srp;

public class ConsoleSender implements Sender{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
