import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureSupplyAsync {

  private void start() throws InterruptedException, ExecutionException {
    CompletableFuture<String> completableFuture  = CompletableFuture.supplyAsync( () -> {
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException ie){
        System.out.println("InterruptedException: " + ie.getMessage());
      }
      return "3 seconds";
    }).thenApply(message -> {
      return "I have been sleeping " + message;
    });
    System.out.println(completableFuture.get());
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new CompletableFutureSupplyAsync().start();
  }

}

