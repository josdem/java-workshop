import java.util.List;
import java.util.Arrays;

public class IntegerFilter {

  private Integer parse(){
    return List.of(3, 13, 31, 35, 41, 50, 66, 79, 100).
      stream().filter( n -> n >= 20 && n <= 60 ).mapToInt(Integer::intValue).sum();
  }

  public static void main(String[] args){
    var result = new IntegerFilter().parse();
    assert 157 == result;
  }

}