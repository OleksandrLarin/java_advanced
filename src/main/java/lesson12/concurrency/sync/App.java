package lesson12.concurrency.sync;

public class App {
    private final Object obj1 = new Object();
    private final Object obj2 = new Object();

    public static void main(String[] args) {
        App app = new App();
        Thread thread1 = new Thread(new Worker(app));
        Thread thread2 = new Thread(new Worker2(app));

        thread1.start();
        thread2.start();
    }

    public void method1() {
        synchronized (obj1) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method1");
        }
    }

    public void method2() {
        synchronized (obj2) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method2");
        }
    }

    public synchronized void method3() {

    }
}
