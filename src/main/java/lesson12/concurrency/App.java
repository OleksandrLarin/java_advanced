package lesson12.concurrency;

import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);
        semaphore.acquire();
        System.out.println("finish");
    }
}
