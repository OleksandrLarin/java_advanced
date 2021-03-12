package lesson9.patterns.builder;

public class User {
    private String name;
    private String lastName;
    private int age;

    private User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static class UserBuilder {
        private String nameB;
        private String lastNameB;
        private int ageB;

        public User build() {
            return new User(nameB, lastNameB, ageB);
        }

        public UserBuilder name(String name) {
            nameB = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            lastNameB = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            ageB = age;
            return this;
        }
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
