public class Launcher {

  public String getMessage(){

    new Greeting() {
      @Override
      public String sayHello() {
        return "Hello World!";
      }
    };

    return "Hello!";

  }

  public static void main(String[] args){
    String message = new Launcher().getMessage();
    System.out.println("message: " + message);
    assert "Hello World!" == message;
  }

}

