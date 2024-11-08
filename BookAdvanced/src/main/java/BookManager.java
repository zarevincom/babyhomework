import java.util.HashSet;

public interface BookManager {
    void create(String name, String author);
    void delete(String name);
    HashSet<Book> getCollection();
    boolean isInCollection(String name);
}
