package lesson9.patterns.strategy;

import java.util.Map;

public class Context {
    private Strategy defaultStrategy = new ConsoleStrategy();

    private final Map<String, Strategy> strategies = Map.of(
            "console", new ConsoleStrategy(),
            "file", new FileStrategy()
    );

    public void execute(String message, String type) {
        strategies.getOrDefault(type, defaultStrategy).execute(message);
    }
}
