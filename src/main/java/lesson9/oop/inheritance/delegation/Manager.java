package lesson9.oop.inheritance.delegation;

public class Manager {
    private final Worker worker = new Worker();

    public void work() {
        worker.work();
    }
}
