package lesson9.patterns.builder;

public class App {
    public static void main(String[] args) {
        String string = new StringBuilder("")
                .append(1)
                .append(2)
                .append(3)
                .append(".")
                .toString();

        System.out.println(string);


        User emptyUser = User.builder().build();
        User user = User.builder()
                .lastName("Black")
                .name("Bill")
                .age(36)
                .build();

        System.out.println(emptyUser);
        System.out.println(user);
    }
}
