import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureRunAsync {

  private void start() throws InterruptedException, ExecutionException {
    CompletableFuture<Void> completableFuture =
        CompletableFuture.runAsync(
            () -> {
              try {
                TimeUnit.SECONDS.sleep(3);
              } catch (InterruptedException ie) {
                ie.printStackTrace();
              }
            });
    completableFuture.get();
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new CompletableFutureRunAsync().start();
  }
}
