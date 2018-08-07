public class Launcher {

  public String getMessage(){
    final String greeting = new Greeting() {

      @Override
      public String sayHello() {
        return "Hello World!";
      }
    };

    return greeting;
  }

  public static void main(String[] args){
    String message = new Launcher().getMessage();
    assert("Hello World!", message);
  }

}

