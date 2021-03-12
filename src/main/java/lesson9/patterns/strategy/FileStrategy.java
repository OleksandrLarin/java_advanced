package lesson9.patterns.strategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileStrategy implements Strategy {
    @Override
    public void execute(String message) {
        try (FileWriter fileWriter = new FileWriter("log.txt")) {
            fileWriter.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
