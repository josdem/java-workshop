import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class FirstFinder {

  private String findFirstLongName(List<String> nicknames){
    return nicknames.stream().filter(it -> it.length() > 10).findFirst().orElse("");
  }

  public static void main(String[] args){
    List<String> nicknames = Arrays.asList("josdem","tgrip","erich","martinvilegas","skuarch");
    String result = new FirstFinder().findFirstLongName(nicknames);
    assert "martinvilegas" == result;
  }
}