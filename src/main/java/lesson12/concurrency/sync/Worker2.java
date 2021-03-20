package lesson12.concurrency.sync;

public class Worker2 implements Runnable {
    private App app;

    public Worker2(App app) {
        this.app = app;
    }

    @Override
    public void run() {
        app.method2();
    }
}
