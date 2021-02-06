package lecture1.immutable;

public class ImmutableObjectExample {
    public static void main(String[] args) {
        String name = "baeldung";
        String newName = name.replace("dung", "----");

        System.out.println(name.equals("baeldung"));
        System.out.println(newName.equals("bael----"));
    }
}
