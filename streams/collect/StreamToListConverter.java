import java.util.List;
import java.util.stream.Collectors;

public class StreamToListConverter {

  private List<String> parse(){
    return List.of("Java", "C++", "Lisp", "Haskell").
      stream().filter( it -> it.length() == 4 ).toList();
  }

  public static void main(String[] args){
    var result = new StreamToListConverter().parse();
    assert 2 == result.size();
    assert result.contains("Java");
    assert result.contains("Lisp");
  }

}