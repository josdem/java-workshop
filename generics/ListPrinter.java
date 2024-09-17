import java.util.List;
import java.util.Arrays;
public class ListPrinter {

  private <T> void printList(List<T> collection){
    for(T item: collection){
      System.out.printf("%s ", item);
    }
  }

  public static void main(String[] args){
    var integers = List.of(1,2,3,4,5);
    var doubles = List.of(1.1,2.2,3.3,4.4,5.5);
    var chars = List.of('J','O','S','D','E','M');
    var printer = new ListPrinter();
    printer.printList(integers);
    System.out.println();
    printer.printList(doubles);
    System.out.println();
    printer.printList(chars);
  }
}