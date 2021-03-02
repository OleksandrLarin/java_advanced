package lecture7.generics.storage;

public class App {
    public static void main(String[] args) {
        Storage<Book> bookStorage = new Storage<>();
        bookStorage.setBook(new Book());
        bookStorage.setBook(new Brochure());

        Storage<Brochure> brochureStorage = new Storage<>();
        brochureStorage.setBook(new Brochure());
//        brochureStorage.setBook(new Book());

//        Storage<String> stringStorage = new Storage<>();
//        stringStorage.setBook("");
    }
}
