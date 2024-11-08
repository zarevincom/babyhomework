import java.util.ArrayList;

public interface Manager {
    void create(String name);
    void delete(int id);
    ArrayList<Student> getStudents();
}
