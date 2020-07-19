import java.util.concurrent.*;

public class ExecutorCallable {

  private static final Integer MAX_PERIOD_TIME = 30;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private Integer start() throws InterruptedException, ExecutionException {
    Future<Integer> future = executor.submit(new CallableThread());
    final Integer result = future.get();
    executor.shutdown();

    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
    return result;
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Integer result = new ExecutorCallable().start();
    assert result == 3;
  }
}

class CallableThread implements Callable<Integer> {

  @Override
  public Integer call() throws InterruptedException {
    final Integer wait = 3;
    TimeUnit.SECONDS.sleep(wait);
    return wait;
  }
}
