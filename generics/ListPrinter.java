import java.util.List;
import java.util.Arrays;

public class ListPrinter {

  private <T> void printList(List<T> collection){
    for(T item: collection){
      System.out.printf("%s ", item);
    }
    System.out.println();
  }

  public static void main(String[] args){
    List<Integer> integers = Arrays.asList(1,2,3,4,5);
    List<Double> doubles = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
    List<Character> string = Arrays.asList('J','O','S','D','E','M');
    ListPrinter printer = new ListPrinter();
    System.out.println("Printing integers");
    printer.printList(integers);
    System.out.println("Printing doubles");
    printer.printList(doubles);
    System.out.println("Printing string");
    printer.printList(string);
  }
}