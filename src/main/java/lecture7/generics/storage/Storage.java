package lecture7.generics.storage;

public class Storage<T extends Book> {
    private T book;

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        book.read();
        this.book = book;
    }
}
