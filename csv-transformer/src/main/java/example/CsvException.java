package example;

import java.lang.RuntimeException;

public class CsvException extends RuntimeException {

  CsvException(String message) {
    super(message);
  }

}