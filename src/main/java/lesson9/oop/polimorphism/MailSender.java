package lesson9.oop.polimorphism;

public class MailSender implements Sender{
    @Override
    public void send(String msg) {
        System.out.println("Mail is sent");
    }
}
