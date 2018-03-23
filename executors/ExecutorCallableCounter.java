import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

public class ExecutorCallableCounter {

  private final static Integer MAX_PERIOD_TIME = 30;

  private ExecutorService executor = Executors.newFixedThreadPool(3);

  private void start() throws InterruptedException, ExecutionException {
    Future<Integer> callFuture = executor.submit(new CallableThread());
    final Integer result = callFuture.get();
		executor.shutdown();

		System.out.println("I have been counting: " + result + " times");
    executor.awaitTermination(30, TimeUnit.SECONDS);
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    new ExecutorCallableCounter().start();
  }
}

class CallableThread implements Callable<Integer> {

  @Override
  public Integer call(){
    Integer counter = 0;
    while(counter < 5){
      counter++;
    }
    return counter;
  }

}
