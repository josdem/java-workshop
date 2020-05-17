import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Name {

  private List<String> filter(List<String> names){
    return names.stream()
      .filter(name -> name.startsWith("J"))
      .collect(Collectors.toList());
  }

  public static void main(String[] arg){
    var names = Arrays.asList("Jose", "Luis", "Juan", "Bruno", "Valentina");
    var filteredNames = new Name().filter(names);

    filteredNames.forEach(System.out::println);
  }
}
