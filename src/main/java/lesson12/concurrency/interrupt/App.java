package lesson12.concurrency.interrupt;

public class App {
    public static void main(String[] args) {
        Runnable worker = () -> {
            long count = 0;
            count = 1 / 0;
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(count++);
            }
        };

        Thread thread = new Thread(worker);
        thread.start();

        try {
            Thread.sleep(1500);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
