import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureSupplyAsync {

  private String start() throws InterruptedException, ExecutionException {
    final Supplier<String> supplier = () -> "hello";
    final Function<String, String> function = value -> value + " world";

    var completableFuture = CompletableFuture.supplyAsync(supplier).thenApply(function);
    return completableFuture.get();
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    var result = new CompletableFutureSupplyAsync().start();
    assert result.equals("hello world");
  }
}
