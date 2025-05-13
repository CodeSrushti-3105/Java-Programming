class Data {
    int value;
    boolean hasValue = false;

    // Producer puts value
    synchronized void produce(int val) throws InterruptedException {
        while (hasValue) {
            wait(); // wait until value is consumed
        }
        value = val;
        System.out.println("Produced: " + value);
        hasValue = true;
        notify(); // notify consumer
    }

    // Consumer takes value
    synchronized void consume() throws InterruptedException {
        while (!hasValue) {
            wait(); // wait until value is produced
        }
        System.out.println("Consumed: " + value);
        hasValue = false;
        notify(); // notify producer
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Data data = new Data();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    data.produce(i);
                    Thread.sleep(500); // just to slow it down a bit
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    data.consume();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
