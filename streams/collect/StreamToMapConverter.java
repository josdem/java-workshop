import java.util.Map;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamToMapConverter {

  private Map<String, Integer> parse(){
    return List.of("Java", "C++", "Lisp", "Haskell").
      stream().collect(Collectors.toMap(Function.identity(), String::length));
  }

  public static void main(String[] args){
    var result = new StreamToMapConverter().parse();
    assert 4 == result.size();
    assert result.get("Java") == 4;
    assert result.get("C++") == 3;
    assert result.get("Lisp") == 4;
    assert result.get("Haskell") == 7;
  }

}
