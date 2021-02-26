package lecture5.mocks;

import java.util.List;

public class Manager {
    private List<User> list;

    public Manager(List<User> list) {
        this.list = list;
    }

    public void createUserByName(String string) {
        User user = new User(System.currentTimeMillis());
        user.setName(string);
        list.add(user);
    }

    public User findByName(String name) {
        return list.stream()
                .filter(user -> name.equals(user.getName()))
                .findAny()
                .orElse(null);
    }
}
