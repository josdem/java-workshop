import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static java.time.temporal.ChronoUnit.DAYS;

public class BetweenDays {

  private void compute() {
    LocalDate christmas = LocalDate.of(2020, Month.DECEMBER, 25);
    LocalDate today = LocalDate.now();
    long days = DAYS.between(today, christmas);
    System.out.println("There are " + days + " shopping days until Christmas");

    Period untilChristmas = Period.between(today, christmas);
    System.out.println(
        "There are "
            + untilChristmas.getMonths()
            + " months and "
            + untilChristmas.getDays()
            + " days until Christmas");
  }

  public static void main(String[] args) {
    new BetweenDays().compute();
  }
}
