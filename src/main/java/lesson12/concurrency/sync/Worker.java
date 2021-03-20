package lesson12.concurrency.sync;

public class Worker implements Runnable{
    private App app;

    public Worker(App app) {
        this.app = app;
    }

    @Override
    public void run() {
        app.method1();
    }
}
