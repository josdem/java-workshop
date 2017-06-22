import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamToListConverter {

  private List<String> parse(){
    return Arrays.asList("Java", "C++", "Lisp", "Haskell").
      stream().filter( it -> it.length() == 4 ).collect(Collectors.<String>toList());
  }

  public static void main(String[] args){
    List<String> result = new StreamToListConverter().parse();
    assert 2 == result.size();
    assert result.contains("Java");
    assert result.contains("Lisp");
  }

}