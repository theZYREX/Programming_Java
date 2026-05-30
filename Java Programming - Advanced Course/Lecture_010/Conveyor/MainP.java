import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainP {
    public static void main(String[] args) {
        BlockingQueue<String> queueA = new ArrayBlockingQueue<>(5);
        BlockingQueue<String> queueB = new ArrayBlockingQueue<>(5);
        BlockingQueue<String> queueC = new ArrayBlockingQueue<>(5);
        BlockingQueue<String> queueD = new ArrayBlockingQueue<>(5);

        Thread producerA = new Thread(new ConveyorBelt("A", 1000, queueA));

        Thread producerC = new Thread(new ConveyorBelt("C", 2000, queueC));

        Thread producerD = new Thread(new ConveyorBelt("D", 1000, queueD));

        Thread assemblerB = new Thread(new ConveyorBelt("B", 3000, queueB, queueC, queueD));

        Thread productAssembler = new Thread(new ProductAssembler(2000, queueA, queueB, queueC, queueD));

        System.out.println("Запуск всех конвейеров...");
        producerA.start();
        producerC.start();
        producerD.start();
        assemblerB.start();
        productAssembler.start();
    }
}
