import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamToStringConverter {

  private String parse(){
    return Arrays.asList("Java", "C++", "Lisp", "Haskell").
      stream().collect(Collectors.joining(","));
  }

  public static void main(String[] args){
    String result = new StreamToStringConverter().parse();
    assert "Java,C++,Lisp,Haskell".equals(result);
  }

}