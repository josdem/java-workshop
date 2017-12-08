import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorCounter {

	private Integer count = 0;
	private ExecutorService executor = Executors.newFixedThreadPool(2);

	private Integer start(){
		IntStream.range(0, 10000)
    .forEach(i -> executor.submit(this::incrementSync));
		executor.shutdown();
		try {
    	executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    } catch (InterruptedException e) {
    	System.out.println("Exception:" + e.getMessage());
    }
		return count;
	}

	private synchronized void incrementSync() {
		count++;
	}
	
	public static void main(String[] args){
		Integer result = new ExecutorCounter().start();
		System.out.println(result);
	}

}