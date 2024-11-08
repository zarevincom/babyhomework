public class Main {
    public static void main(String[] args) {
        BookCollection books = new BookCollection();
        books.create("451 градус по фаренгейту", "Рэй Бредбери");
        books.create("Прикиолдаска", "Бед Раниман");
        books.delete("451 градус по фаренгейту");
        System.out.println(books.isInCollection("451 градус по фаренгейту"));
    }
}
