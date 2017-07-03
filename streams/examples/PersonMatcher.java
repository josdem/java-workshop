import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class PersonMatcher {

  private Boolean anyPersonStartsWith(List<Person> persons, String prefix){
    Predicate<Person> predicate = person -> person.name.startsWith(prefix);
    return persons.stream().anyMatch(predicate);
  }

  private Boolean allAreSameType(List<Person> persons, RoleType type){
    Predicate<Person> predicate = person -> person.type == type;
    return persons.stream().allMatch(predicate);
  }

  private Boolean nonePersonEndsWith(List<Person> persons, String suffix){
    Predicate<Person> predicate = person -> person.name.endsWith(suffix);
    return persons.stream().noneMatch(predicate);
  }

  public static void main(String[] args){
  	List<Person> persons = Arrays.asList(
  		new Person("josdem", RoleType.DEVELOPER),
      new Person("tgtip", RoleType.DEVELOPER),
      new Person("skuarch", RoleType.DEVELOPER)
    );
    PersonMatcher matcher = new PersonMatcher();

    Boolean result = matcher.anyPersonStartsWith(persons, "j");
    assert result;

    result = matcher.allAreSameType(persons, RoleType.DEVELOPER);
    assert result;

    result = matcher.nonePersonEndsWith(persons, "zh");
    assert result;
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
