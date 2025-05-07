import java.util.List;

public class ListPrinter {
  private static <T> void printList(List<T> collection){ // Remove static if you are doing way 2
    for(T item: collection){
      System.out.print(item + " ");
    }

    System.out.println();
  }

  public static void main(String[] args){
    List<Integer> integers = List.of(1,2,3,4,5);
    List<Double> doubles = List.of(1.1,2.2,3.3,4.4,5.5);
    List<Character> chars = List.of('J','O','S','D','E','M');

    // Way 1
    System.out.print("Integers: ");
    printList(integers);

    System.out.print("Doubles: ");
    printList(doubles);
    
    System.out.print("Characters: ");
    printList(chars);

    // Way 2
    // ListPrinter printer = new ListPrinter();
    
    // System.out.print("Integers: ");
    // printer.printList(integers);

    // System.out.print("Doubles: ");
    // printer.printList(doubles);
    
    // System.out.print("Characters: ");
    // printer.printList(chars);
  }
}
