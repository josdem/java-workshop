import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    private void format(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM");
        LocalDate today = LocalDate.now();
        System.out.println("YYYY-MMM format from now is: " + today.format(formatter));
    }

    public static void main(String[] args){
        new DateFormatter().format();
    }

}