import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

public class ExecutorCallable {

  private final static Integer MAX_PERIOD_TIME = 30;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private void start() throws InterruptedException, ExecutionException {
    Future<Integer> future = executor.submit(new CallableThread());
    final Integer result = future.get();
		executor.shutdown();

		System.out.println("I have been sleeping: " + result + " seconds");
    executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new ExecutorCallableCounter().start();
  }
}

class CallableThread implements Callable<Integer> {

  @Override
  public Integer call() throws InterruptedException{
    final Integer wait = 3;
    TimeUnit.SECONDS.sleep(wait);
    return wait;
  }

}
