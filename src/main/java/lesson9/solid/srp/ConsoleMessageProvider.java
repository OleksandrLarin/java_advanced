package lesson9.solid.srp;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleMessageProvider implements Provider {

    private InputStream in;

    public ConsoleMessageProvider(InputStream in) {
        this.in = in;
    }

    public ConsoleMessageProvider() {
        in = System.in;
    }

    @Override
    public String getMessage() {
        in = System.in;
        try (Scanner scanner = new Scanner(in)) {
            return scanner.nextLine();
        }
    }
}
