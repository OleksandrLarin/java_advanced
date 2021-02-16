package lecture3.lambda.defaul;

public interface DefaultExample {
    void print(String string);

    default String getStringUpperCase(String s) {
        return s.toUpperCase();
    }


    static String getClassName() {
        return DefaultExample.class.getName();
    }
}
