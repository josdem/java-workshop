import java.util.List;
import java.util.function.Predicate;

public class ContactLambda {
  public void phoneContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboCall(p);
      }
    }
  }

  public void emailContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboEmail(p);
      }
    }
  }

  public void mailContacts(List<Person> pl, Predicate<Person> pred){
    for(Person p:pl){
      if (pred.test(p)){
        roboMail(p);
      }
    }
  }

  public void roboCall(Person p){
    System.out.println("Calling " + p.getName() + " age " + p.getAge());
  }

  public void roboEmail(Person p){
    System.out.println("EMailing " + p.getName() + " age " + p.getAge());
  }

  public void roboMail(Person p){
    System.out.println("Mailing " + p.getName() + " age " + p.getAge());
  }

}
