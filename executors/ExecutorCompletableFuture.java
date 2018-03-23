import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CompletableFuture;

public class ExecutorCompletableFuture {

  private final static Integer MAX_PERIOD_TIME = 30;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private void start() throws InterruptedException, ExecutionException {
    CompletableFuture<Integer> completableFuture  = new CompletableFuture<Integer>();

    executor.submit(() -> {
      try{
        final Integer wait = 3;
        TimeUnit.SECONDS.sleep(wait);
        completableFuture.complete(wait);
      } catch (InterruptedException ie){
        System.out.println("InterruptedException: " + ie.getMessage());
      }    
    });    

    final Integer result = completableFuture.get();
		executor.shutdown();

		System.out.println("I have been sleeping: " + result + " seconds");
    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new ExecutorCompletableFuture().start();
  }
}

