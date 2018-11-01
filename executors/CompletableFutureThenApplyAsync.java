import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenApplyAsync {

  private void start() throws InterruptedException, ExecutionException {
    CompletableFuture<Integer> completableFuture  = CompletableFuture.completedFuture(3).thenApplyAsync(wait -> {
      try{
        TimeUnit.SECONDS.sleep(wait);
      } catch(InterruptedException ie){
        System.out.println("InterruptedException: " + ie.getMessage());
      }
      return wait;
    });

    final Integer result = completableFuture.get();
		System.out.println("I have been sleeping: " + result + " seconds");
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new CompletableFutureThenApplyAsync().start();
  }
}

