package lesson12.concurrency.join;

public class App {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Hello from sub thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("Hello from main");

        try {
            thread.join(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finish");
    }
}
