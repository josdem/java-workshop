package example

import java.lang.RuntimeException
import java.lang.Throwable

class RestException extends RuntimeException {

  RestException(String message){
    super(message)
  }

  RestException(String message, Throwable cause){
    super(message, cause)
  }  

}
