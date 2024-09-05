import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

  private static final Integer MAX_PERIOD_TIME = 10;

  private ExecutorService executor = Executors.newSingleThreadExecutor();

  private void start() throws InterruptedException {
    executor.execute(task);
    executor.shutdown();
    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
  }

  private Runnable task = () -> System.out.println("Asynchronous task");

  public static void main(String[] args) throws InterruptedException {
    new ExecutorExample().start();
  }
}
