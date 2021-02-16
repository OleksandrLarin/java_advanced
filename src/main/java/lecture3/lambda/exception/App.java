package lecture3.lambda.exception;

public class App {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        };
    }
}
