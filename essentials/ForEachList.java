import java.util.List;
import java.util.ArrayList;

class ForEachList {

  void iterate(List<String> items){
    items.forEach(System.out::println);
  }

  public static void main(String[] args){
    List<String> items = new ArrayList<String>();
    items.add("A");
    items.add("B");
    items.add("C");

    new ForEachList().iterate(items);
  }

}