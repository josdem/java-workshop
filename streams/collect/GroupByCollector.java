import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCollector {

  private Map<RoleType, List<Person>> parse(List<Person> persons){
    return persons.stream().collect(Collectors.groupingBy(Person::getType));
  }

  public static void main(String[] args){
  	var persons = List.of(
      new Person("josdem", RoleType.DEVELOPER),
      new Person("tgtip", RoleType.DEVELOPER),
      new Person("erich", RoleType.TESTER)
    );
    var result = new GroupByCollector().parse(persons);
    assert result.get(RoleType.DEVELOPER).size() == 2;
    assert result.get(RoleType.TESTER).size() == 1;
  }

}

class Person {
  String name;
  RoleType type;

  public Person(String name, RoleType type){
    this.name = name;
    this.type = type;
  }

  RoleType getType(){
    return type;
  }
}

enum RoleType {
  DEVELOPER, TESTER
}
