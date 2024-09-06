import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorCallable {

  private static final Integer MAX_PERIOD_TIME = 10;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private Integer start() throws InterruptedException, ExecutionException {
    var future = executor.submit(new CallableThread());
    final var result = future.get();
    executor.shutdown();

    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
    return result;
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    var result = new ExecutorCallable().start();
    assert result == 3;
  }
}

class CallableThread implements Callable<Integer> {

  @Override
  public Integer call() throws InterruptedException {
    final var wait = 3;
    TimeUnit.SECONDS.sleep(wait);
    return wait;
  }
}
