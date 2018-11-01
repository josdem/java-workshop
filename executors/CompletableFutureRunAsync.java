import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureRunAsync {

  private void start() throws InterruptedException, ExecutionException {
    CompletableFuture<Void> completableFuture  = CompletableFuture.runAsync( () -> {
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException ie){
        System.out.println("InterruptedException: " + ie.getMessage());
      }
    });
    completableFuture.get();
		System.out.println("I have been sleeping: 3 seconds");
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new CompletableFutureRunAsync().start();
  }

}

