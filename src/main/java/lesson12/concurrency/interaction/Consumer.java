package lesson12.concurrency.interaction;

public class Consumer extends Thread {
    private final Store store;
    private int count = 0;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            while (count++ < 5) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + store.get());
            }
        }
    }
}
