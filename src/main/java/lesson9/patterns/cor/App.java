package lesson9.patterns.cor;

import java.util.List;

public class App {
    public static void main(String[] args) {
       Handler handler1 = new ConsoleHandler();
       Handler handler2 = new ConsoleHandler();
       Handler handler3 = new FileHandler();
       Handler handler4 = new FileHandler();

       handler1.setNextHandler(handler2);
       handler2.setNextHandler(handler3);
       handler3.setNextHandler(handler4);


       Event fileEvent = new Event("Some file event", "file");
       Event consoleEvent = new Event("Some console event", "console");

       handler1.handle(consoleEvent);

    }
}
