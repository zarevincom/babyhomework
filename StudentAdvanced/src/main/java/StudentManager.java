import java.util.ArrayList;

public class StudentManager implements Manager {
    private final ArrayList<Student> students = new ArrayList<>();

    @Override
    public void create(String name) {
        Student newStudent = new Student(name);
        students.add(newStudent);
    }

    @Override
    public void delete(int id) {
        System.out.printf("Удаляю курьера c id = %d\n", id);
        students.removeIf(student -> student.getId() == id);
    }

    @Override
    public ArrayList<Student> getStudents() {
        return students;
    }
}
