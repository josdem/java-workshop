import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureThenApplyAsync {

  private String start() throws InterruptedException, ExecutionException {
    final Supplier<String> supplier = () -> "hello";
    final CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier);
    final CompletableFuture<String> future = completableFuture.thenApplyAsync(value -> value + " world");

    return future.get();
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    var result = new CompletableFutureThenApplyAsync().start();
    assert result.equals("hello world");
  }
}
