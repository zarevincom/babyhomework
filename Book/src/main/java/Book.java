public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        System.out.printf("Книга %s выпущена в %d году. Автор: %s%n", title, year, author);
    }
}