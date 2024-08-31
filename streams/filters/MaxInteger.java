import java.util.List;
import java.util.OptionalInt;

public class MaxInteger {

  private OptionalInt parse(){
    return List.of(3, 13, 31, 35, 41, 50, 66, 79, 100).
      stream().mapToInt(number -> number.intValue()).max();
  }

  public static void main(String[] args){
    var result = new MaxInteger().parse();
    assert 100 == result.getAsInt();
  }

}
