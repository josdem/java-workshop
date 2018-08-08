public class Launcher {

  private String run(){

    new HelloWorld().call(new Greeting() {

      @Override
      public String hello() {
        return "Hello World!";
      }

    });

  }

  public static void main(String[] args){
    String message = new Launcher().run();
    System.out.println("message: " + message);
    assert "Hello World!" == message;
  }

}

