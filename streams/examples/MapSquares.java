import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MapSquares {

  private List<Integer> square(List<Integer> numbers){
    return numbers.stream().map(it -> it * it).toList();
  }

  public static void main(String[] args){
    var numbers = List.of(1,2,3,4,5,6,7,8);
    var result = new MapSquares().square(numbers);
    assert result.size() == 8;
    assert result.get(1) == 4;
    assert result.get(3) == 16;
  }
}
