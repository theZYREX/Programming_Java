import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> sharedList = new ArrayList<>();

        SorterThread sorterTask = new SorterThread(sharedList);
        Thread sorterThread = new Thread(sorterTask);
        sorterThread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строки. Пустая строка для завершения.");

        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            synchronized (sharedList) {
                System.out.println("<- Главный поток добавляет строку...");

                for (int i = 0; i < line.length(); i += 80) {
                    int endIndex = Math.min(i + 80, line.length());
                    sharedList.add(line.substring(i, endIndex));
                }
            }
        }

        System.out.println("\nПрограмма завершается. Останавливаем сортировщик...");
        sorterTask.stopRunning();

        System.out.println("Итоговый список:");
        synchronized (sharedList) {
            for (String s : sharedList) {
                System.out.println(s);
            }
        }
    }
}
