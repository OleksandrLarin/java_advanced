package lesson9.solid.srp;

import java.io.FileWriter;
import java.io.IOException;

public class FileMessageSender implements Sender {
    @Override
    public void send(String message) {
        try (FileWriter fileWriter = new FileWriter("log.txt")) {
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
