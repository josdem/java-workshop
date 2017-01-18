package example.exception;

import java.lang.RuntimeException;

public class LambdaException extends RuntimeException {

  public LambdaException(String message){
    super(message);
  }

  public LambdaException(String message, Throwable cause) {
    super(message, cause);
  }

}

