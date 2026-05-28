import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите источник данных:");
        System.out.println("1: ArrayList");
        System.out.println("2: TreeSet");
        int choice = scanner.nextInt();

        StudentDao dao;

        if (choice == 1) {
            dao = new ArrayListStudentDao();
            System.out.println("Выбран источник данных: ArrayList");
        } else {
            dao = new TreeSetStudentDao();
            System.out.println("Выбран источник данных: TreeSet");
        }

        System.out.println("\n--- Начальная демонстрация ---");

        System.out.println("Все студенты:");
        dao.getAllStudents().forEach(System.out::println);

        System.out.println("\nСтудент с ID=2:");
        System.out.println(dao.getStudent(2));

        System.out.println("\nДобавляем нового студента...");
        Student newStudent = new Student(4, "Maria Sklodowska", "PH305");
        dao.addStudent(newStudent);
        dao.getAllStudents().forEach(System.out::println);

        System.out.println("\nОбновляем студента с ID=1...");
        Student updatedStudent = new Student(1, "Ivan The Great", "CS505");
        dao.updateStudent(updatedStudent);
        dao.getAllStudents().forEach(System.out::println);

        System.out.println("\nУдаляем студента с ID=2...");
        dao.deleteStudent(new Student(2, "", ""));
        dao.getAllStudents().forEach(System.out::println);
    }
}
