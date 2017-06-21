import java.util.Arrays;
import java.util.OptionalInt;

public class MaxInteger {

  private OptionalInt parse(){
    return Arrays.asList(3, 13, 31, 35, 41, 50, 66, 79, 100).
      stream().mapToInt(Integer::intValue).max();
  }

  public static void main(String[] args){
    OptionalInt result = new MaxInteger().parse();
    assert 100 == result.getAsInt();
  }

}
