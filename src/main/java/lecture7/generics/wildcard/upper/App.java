package lecture7.generics.wildcard.upper;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book());
        List<Album> albums = List.of(new Album());
        List<Brochure> brochures = List.of(new Brochure());
        List<String> strings = List.of("string");
        List<AlbumChild> albumChildren = List.of(new AlbumChild());

        readBooks(books);
        readBooks(albums);
        readBooks(brochures);
//        readBooks(strings);
        addBook(books);
        addAlbum(albums);
        addAlbum(books);
//        addAlbum(albumChildren);
    }

    private static void readBooks(List<? extends Book> books) {
        books.forEach(Book::read);
    }

    private static void addAlbum(List<? super Album> books) {
        books.add(new Album());
        books.add(new AlbumChild());
    }

    private static void addBook(List<? super Book> books) {
        books.add(new Book());
    }
}
