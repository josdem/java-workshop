import java.time.LocalDate;
import java.time.Month;

public class DateTimeOperations {

  private void operations(){
    LocalDate today = LocalDate.now();
    System.out.println("today in YYYY-MM-DD format: " + today);
    System.out.println("Day of the week: " + today.getDayOfWeek());
    System.out.println("Next week: " + today.plusDays(7));
    System.out.println("Is a Leap Year?: " + today.isLeapYear());

    LocalDate chrismas = LocalDate.of(2016, Month.DECEMBER, 25);
    System.out.println("Today is bafore Chirsmas?: " + today.isBefore(chrismas));
  }

  public static void main(String[] args){
    new DateTimeOperations().operations();
  }
}
