import java.util.concurrent.*;

public class ExecutorCallable {

  private static final Integer MAX_PERIOD_TIME = 30;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private void start() throws InterruptedException, ExecutionException {
    Future<Integer> future = executor.submit(new CallableThread());
    final Integer result = future.get();
    executor.shutdown();

    System.out.println("I have been sleeping: " + result + " seconds");
    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new ExecutorCallable().start();
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
