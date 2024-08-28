import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class StreamReductor {

  private Optional<String> getLargestName(List<String> nicknames){
    return nicknames.stream().reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2);
  }

  public static void main(String[] args){
    var nicknames = Arrays.asList("josdem","tgrip","erich","martinvilegas","skuarch");
    var result = new StreamReductor().getLargestName(nicknames);
    assert "martinvilegas" == result.get();
  }

}
