import java.util.concurrent.BlockingQueue;

public class ConveyorBelt implements Runnable {
    private String partName;
    private int productionTime;
    private BlockingQueue<String> outputQueue;
    private BlockingQueue<String>[] inputQueues;

    public ConveyorBelt(String partName, int productionTime, BlockingQueue<String> outputQueue) {
        this.partName = partName;
        this.productionTime = productionTime;
        this.outputQueue = outputQueue;
        this.inputQueues = null;
    }

    @SafeVarargs
    public ConveyorBelt(String partName, int productionTime, BlockingQueue<String> outputQueue, BlockingQueue<String>... inputQueues) {
        this.partName = partName;
        this.productionTime = productionTime;
        this.outputQueue = outputQueue;
        this.inputQueues = inputQueues;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (inputQueues != null) {
                    for (BlockingQueue<String> inputQueue : inputQueues) {
                        String takenPart = inputQueue.take();
                        System.out.println("... " + partName + "-сборщик взял деталь " + takenPart);
                    }
                }

                System.out.println("... " + partName + "-сборщик начал производство...");
                Thread.sleep(productionTime);

                outputQueue.put(partName);
                System.out.println("+++ " + partName + "-сборщик произвел деталь " + partName + ". На складе: " + outputQueue.size());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Поток " + partName + " был прерван.");
        }
    }
}
