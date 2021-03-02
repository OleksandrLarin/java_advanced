package lecture7.generics.example2.model;

public class User extends Entity{

    public User(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
