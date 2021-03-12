package lesson9.oop.polimorphism;

public class SmsSender implements Sender{
    @Override
    public void send(String msg) {
        System.out.println("Sms is sent");
    }
}
