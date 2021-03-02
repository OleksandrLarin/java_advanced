package lecture7.generics.quiz;

import lecture7.generics.wildcard.upper.Album;
import lecture7.generics.wildcard.upper.Book;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Book> {
    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }

    public static void main(String[] args) {
        Storage<Book> bookStorage = new Storage<>();
        List<Album> albums = List.of(new Album());

        bookStorage.addAll(albums);
    }
}
