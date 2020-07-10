import java.time.LocalDate;
import java.time.Month;

public class DateOperations {

  private void operations() {
    LocalDate localDate = LocalDate.now();
    System.out.println("localDate in YYYY-MM-DD format: " + localDate);
    System.out.println("Day of the week: " + localDate.getDayOfWeek());
    System.out.println("Next week: " + localDate.plusDays(7));
    System.out.println("Is a Leap Year?: " + localDate.isLeapYear());

    LocalDate christmas = LocalDate.of(2016, Month.DECEMBER, 25);
    System.out.println("Today is before Christmas?: " + localDate.isBefore(christmas));

    LocalDate christmasParsed = LocalDate.parse("2020-12-25");
    System.out.println("Christmas Parsed: " + christmasParsed);
  }

  public static void main(String[] args) {
    new DateOperations().operations();
  }
}
