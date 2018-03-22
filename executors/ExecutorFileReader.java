import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Collectors;

public class ExecutorFileReader {

	private final static Integer MAX_PERIOD_TIME = 30;

	private ExecutorService executor = Executors.newSingleThreadExecutor();
	private	List<String> result = new ArrayList<String>();

	private List<String> read(Path path) throws IOException{
		Scanner scanner = new Scanner(path);
		while (scanner.hasNextLine()) {
		  executor.submit(new ThreadTask(result, scanner));		
	  }
    scanner.close();
		executor.shutdown();
		try {
    	executor.awaitTermination(MAX_PERIOD_TIME, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
    	System.out.println("Exception:" + e.getMessage());
    }
		return result;
	}

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("nicknames.txt");
		List<String> result = new ExecutorFileReader().read(path);
		result.forEach(System.out::println);
	}

}

class ThreadTask implements Runnable {

  private Scanner scanner;
  private	List<String> result;

  public ThreadTask(List<String> result, Scanner scanner) {
    this.scanner = scanner;
    this.result = result;
  }

  public void run(){
    result.add(scanner.nextLine());
  }

}