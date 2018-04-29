import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {		
		Consumer<String> consumer = (x) -> System.out.println(x.toLowerCase());
		consumer.accept("JOSDEM");
	}

}