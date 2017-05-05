import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Action {

  public static void main(String[] args){

    Person p1 = new Person();
    p1.setName("eric");
    p1.setAge(35);

    Person p2 = new Person();
    p2.setName("mario");
    p2.setAge(36);


    List<Person> pl = new ArrayList<Person>();
    pl.add(p1);
    pl.add(p2);
    ContactLambda robo = new ContactLambda();

    Predicate<Person> allDrivers = p -> p.getAge() >= 16;
    Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 25;
    Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;

    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, allDrivers);

    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, allDraftees);

    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, allPilots);
  }
}
