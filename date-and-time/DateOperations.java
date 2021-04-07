import java.time.*;

public class DateOperations {

  private void operations() throws Exception {
    LocalDate localDate = LocalDate.now();
    System.out.println("LocalDate in YYYY-MM-DD format: " + localDate);
    System.out.println("Day of the week: " + localDate.getDayOfWeek());
    System.out.println("Next week: " + localDate.plusDays(7));
    System.out.println("Is a Leap Year?: " + localDate.isLeapYear());

    LocalDate christmas = LocalDate.of(2021, Month.DECEMBER, 25);
    System.out.println("Today is before Christmas?: " + localDate.isBefore(christmas));

    LocalDate christmasParsed = LocalDate.parse("2021-12-25");
    System.out.println("Christmas Parsed: " + christmasParsed);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("Local Date Time: " + localDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("Zoned Date Time: " + zonedDateTime);

    Instant instant = Instant.now();
    System.out.println("Instant: " + instant);

    Instant start = Instant.now();
    Thread.sleep(1000);
    Instant end = Instant.now();
    System.out.println("Duration in seconds: " + Duration.between(start, end).getSeconds());
  }

  public static void main(String[] args) throws Exception {
    new DateOperations().operations();
  }
}
