import java.util.Collections;
import java.util.List;

public class SorterThread implements Runnable {

    public List<String> list;

    public volatile boolean shouldGo = true;

    public SorterThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (shouldGo) {
            try {
                Thread.sleep(8000);

                synchronized (list) {
                    System.out.println("-> Сортировщик проснулся и начал сортировку...");

                    Collections.sort(list);

                    System.out.println("-> Сортировка завершена.");
                }

            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Сортировщик завершил свою работу.");
    }

    public void stopRunning() {
        this.shouldGo = false;
    }
}
