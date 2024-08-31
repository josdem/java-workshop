import java.util.List;
import java.util.stream.Collectors;

public class StreamToStringConverter {

  private String parse(){
    return List.of("Java", "C++", "Lisp", "Haskell").
      stream().collect(Collectors.joining(","));
  }

  public static void main(String[] args){
    var result = new StreamToStringConverter().parse();
    assert "Java,C++,Lisp,Haskell".equals(result);
  }

}