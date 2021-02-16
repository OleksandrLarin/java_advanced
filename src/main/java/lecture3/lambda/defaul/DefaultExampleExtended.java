package lecture3.lambda.defaul;

public interface DefaultExampleExtended {
    void print(String string);

    default String getStringUpperCase(String s) {
        return s.toUpperCase();
    }
}
