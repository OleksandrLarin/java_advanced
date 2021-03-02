package lecture7.generics.quiz;

import lecture7.generics.wildcard.upper.Album;
import lecture7.generics.wildcard.upper.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Album> source = new ArrayList<>(List.of(new Album()));
        List<Album> destAlbum = new ArrayList<>(List.of(new Album()));
        List<Book> destination = new ArrayList<>(List.of(new Book()));

        new BookService().copyTo(source, destination);
        new BookService().copyTo(source, destAlbum);
    }

    public <T extends Book> void copyTo(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }
}
