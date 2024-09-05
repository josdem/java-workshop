import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ExecutorAtomic {

  private static final Integer MAX_PERIOD_TIME = 5;
  private AtomicInteger atomic = new AtomicInteger(0);
  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private Integer start() throws InterruptedException {
    IntStream.range(0, 3).forEach(i -> executor.execute(atomic::incrementAndGet));
    executor.shutdown();
    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
    return atomic.get();
  }

  public static void main(String[] args) throws InterruptedException {
    var result = new ExecutorAtomic().start();
    assert result == 3;
  }
}
