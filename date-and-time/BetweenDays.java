import java.time.Month;
import java.time.Period;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.*;

public class BetweenDays {

  private void compute(){
    LocalDate chrismas = LocalDate.of(2016, Month.DECEMBER, 25);
    LocalDate today = LocalDate.now();
    long days = DAYS.between(today, chrismas);
    System.out.println("There are " + days + " shopping days until Chrismas");

    Period untilChristmas = Period.between(today, chrismas);
    System.out.println("There are " + untilChristmas.getMonths() + " months and " + untilChristmas.getDays() + " days until Christmas");
  }

  public static void main(String[] args){
    new BetweenDays().compute();
  }
}
