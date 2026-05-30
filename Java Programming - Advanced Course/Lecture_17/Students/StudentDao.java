import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
