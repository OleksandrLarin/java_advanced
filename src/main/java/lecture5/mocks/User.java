package lecture5.mocks;

public class User {
    private long timestamp;
    private String name;

    public User(long timestamp) {
        this.timestamp = timestamp;
    }
    public User() {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
