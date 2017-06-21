import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CountFilter {

  private Long parse(){
    return Arrays.asList("Java", "C++", "Lisp", "Haskell").
      stream().filter( p -> p.length() == 4).
      collect(Collectors.counting());
  }

  public static void main(String[] args){
    Long result = new CountFilter().parse();
    assert 2L == result;
  }

}
