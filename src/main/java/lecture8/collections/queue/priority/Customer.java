package lecture8.collections.queue.priority;

public class Customer {
    private String name;
    private Status status;
    private int order;

    public Customer(String name) {
        this.name = name;
        this.status = Status.ORDINARY;
    }

    public Customer(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", order=" + order +
                '}';
    }
}
