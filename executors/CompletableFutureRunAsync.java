import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureRunAsync {

  private final static int SLEEP_TIME = 3;

  private CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
    try {
      TimeUnit.SECONDS.sleep(SLEEP_TIME);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
  });

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    var future = new CompletableFutureRunAsync().completableFuture;
    future.join();
    assert future.isDone();
  }
}
