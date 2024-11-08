public class Student {
    private static int idCounter = 0;
    private final int id;
    private String name;

    public Student(String name) {
        this.name = name;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
