package lecture6;

import lecture6.annotation.Value;

public class User {
    @Value("${env.name}")
    public String name;
    private int id;

    @Value("${user.lastname}")
    private String lastName;

    private User(int id) {
        this.id = id;
    }

    public User(String name) {
        this(name.hashCode());
        this.name = name;
    }

    public User() {
        this(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
