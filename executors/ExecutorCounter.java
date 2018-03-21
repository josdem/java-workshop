import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorCounter {

	private Integer count = 0;
	private ExecutorService executor = Executors.newFixedThreadPool(2);

	private Integer start() throws InterruptedException {
		IntStream.range(0, 10).forEach(i -> executor.submit(this::incrementSync));
		executor.shutdown();

		executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		return count;
	}

	private synchronized void incrementSync() {
		System.out.println("count: " + count);
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Integer result = new ExecutorCounter().start();
		System.out.println(result);
	}

}