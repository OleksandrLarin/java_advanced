package lecture3.lambda.defaul;

public class App {
    public static void main(String[] args) {
        DefaultExample defaultExample = new DefaultImpl();

        defaultExample.print("Hello");
        System.out.println(defaultExample.getStringUpperCase("iii"));

        String className = DefaultExample.getClassName();

        
    }
}
