import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureThenApplyAsync {

  private String start() throws InterruptedException, ExecutionException {
    final Supplier<String> supplier = () -> "hello";
    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier);

    CompletableFuture<String> future = completableFuture.thenApplyAsync(value -> value + " world");

    return future.get();
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    String result = new CompletableFutureThenApplyAsync().start();
    assert result.equals("hello world");
  }
}
