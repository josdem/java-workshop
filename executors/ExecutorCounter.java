import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorCounter {

	private final static Integer MAX_PERIOD_TIME = 30;

	private Integer count = 0;
	private ExecutorService executor = Executors.newFixedThreadPool(3);

	private Integer start() throws InterruptedException {
		IntStream.range(0, 3).forEach(i -> executor.submit(this::incrementSync));
		executor.shutdown();

		executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
		return count;
	}

	private void incrementSync() {
		count++;
		System.out.println("I have been saying hello: " + count + " times");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new ExecutorCounter().start();
	}

}