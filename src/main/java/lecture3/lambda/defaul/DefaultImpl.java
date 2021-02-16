package lecture3.lambda.defaul;

public class DefaultImpl implements DefaultExample, DefaultExampleExtended{
    @Override
    public void print(String string) {
        System.out.println(string);
    }

    @Override
    public String getStringUpperCase(String s) {
        return s.toUpperCase();
    }
}
