import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public void GreetingTest {

  private GreetingService greetingService = new HelloWorld();

  @Test
  @DisplayName("Should show how we can use lambdas in a test")
  void shouldGetMessage(){
    final String greeting = greetingService.call(new Greeting() {
      @Override
      public String hello() {
        return "Hello World!";
      }
    });

    assertEquals("Hello, World!", message);
  }

}
