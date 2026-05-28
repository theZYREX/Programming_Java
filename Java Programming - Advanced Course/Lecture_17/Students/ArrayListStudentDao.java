import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListStudentDao implements StudentDao {
    private List<Student> students = new ArrayList<>();

    public ArrayListStudentDao() {
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
        Student studentToUpdate = getStudent(student.getId());
        if (studentToUpdate != null) {
            studentToUpdate.setName(student.getName());
            studentToUpdate.setGroupNumber(student.getGroupNumber());
        }
    }

    @Override
    public void deleteStudent(Student student) {
        students.removeIf(s -> s.getId() == student.getId());
    }
}
