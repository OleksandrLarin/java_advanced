package lesson12.concurrency.lock;

import java.util.concurrent.locks.ReentrantLock;

public class App {
    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;
    public static void main(String[] args) {
        App app = new App();

        Runnable runnable = () -> app.increment();
        Runnable runnable2 = () -> app.increment();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }

    public void increment() {
        if (!lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "Skip this method");
            return;
        }
        System.out.println(Thread.currentThread().getName());
        lock.lock();
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
