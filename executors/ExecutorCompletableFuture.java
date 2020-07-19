import java.util.concurrent.*;

public class ExecutorCompletableFuture {

  private static final Integer MAX_PERIOD_TIME = 30;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private Integer start() throws InterruptedException, ExecutionException {
    CompletableFuture<Integer> completableFuture = new CompletableFuture<>();

    executor.submit(
        () -> {
          try {
            final Integer wait = 3;
            completableFuture.complete(wait);
            TimeUnit.SECONDS.sleep(wait);
          } catch (InterruptedException ie) {
            ie.printStackTrace();
          }
        });

    final Integer result = completableFuture.get();
    executor.shutdown();

    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
    return result;
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Integer result = new ExecutorCompletableFuture().start();
    assert result == 3;
  }
}
