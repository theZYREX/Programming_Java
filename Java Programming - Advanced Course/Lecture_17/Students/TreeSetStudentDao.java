import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudentDao implements StudentDao {
    private Set<Student> students = new TreeSet<>();

    public TreeSetStudentDao() {
        students.add(new Student(1, "Ivan Ivanov", "CS101"));
        students.add(new Student(2, "Petr Petrov", "CS102"));
        students.add(new Student(3, "Anna Sidorova", "MA201"));
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public Student getStudent(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        deleteStudent(student);
        addStudent(student);
    }

    @Override
    public void deleteStudent(Student student) {
        students.removeIf(s -> s.getId() == student.getId());
    }
}
