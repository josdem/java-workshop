public class Launcher {

  public static void main(String[] args){
    String message = new HelloWorld().call({

      @Override
      public String hello() {
        return "Hello World!";
      }

    });
    System.out.println("message: " + message);
    assert "Hello World!" == message;
  }

}

