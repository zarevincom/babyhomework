public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.create("Timofey");
        studentManager.create("Andrey");
        studentManager.create("Ilya");
        for (Student student : studentManager.getStudents()) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }
        studentManager.delete(2);
        for (Student student : studentManager.getStudents()) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
