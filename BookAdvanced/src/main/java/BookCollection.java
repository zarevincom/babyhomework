import java.util.HashSet;
import java.util.Objects;

public class BookCollection implements BookManager {
    private final HashSet<Book> books = new HashSet<>();

    @Override
    public void create(String title, String author) {
        Book bookData = new Book(title, author);
        books.add(bookData);
    }

    @Override
    public HashSet<Book> getCollection() {
        return books;
    }

    @Override
    public boolean isInCollection(String title) {
        for (Book book : getCollection()) {
            if (Objects.equals(book.getTitle(), title)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(String title) {
        books.removeIf(book -> Objects.equals(book.getTitle(), title));
    }
}
