import java.util.concurrent.BlockingQueue;

public class ProductAssembler implements Runnable {
    private int productionTime;
    private BlockingQueue<String> queueA;
    private BlockingQueue<String> queueB;
    private BlockingQueue<String> queueC;
    private BlockingQueue<String> queueD;

    public ProductAssembler(int productionTime, BlockingQueue<String> queueA, BlockingQueue<String> queueB, BlockingQueue<String> queueC, BlockingQueue<String> queueD) {
        this.productionTime = productionTime;
        this.queueA = queueA;
        this.queueB = queueB;
        this.queueC = queueC;
        this.queueD = queueD;
    }

    @Override
    public void run() {
        try {
            int productCount = 0;
            while (true) {
                String partA = queueA.take();
                String partB = queueB.take();

                System.out.println("... Главный конвейер взял " + partA + " и " + partB);

                System.out.println("... Главный конвейер собирает ПРОДУКТ...");
                Thread.sleep(productionTime);
                productCount++;

                System.out.println("#");
                System.out.println("ГОТОВ ПРОДУКТ №" + productCount);
                System.out.println("Текущие запасы на складах:");
                System.out.println("  Детали A: " + queueA.size());
                System.out.println("  Детали B: " + queueB.size());
                System.out.println("  Детали C: " + queueC.size());
                System.out.println("  Детали D: " + queueD.size());
                System.out.println("#\n");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Главный конвейер был прерван.");
        }
    }
}
