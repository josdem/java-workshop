import java.util.Map;
import java.util.HashMap;

class ForEachMap {

  void iterate(Map<String, Integer> items){
    items.forEach((k,v) -> System.out.println("Item : " + k + " Count : " + v));
  }

  public static void main(String[] args){
    Map<String, Integer> items = new HashMap<>();
    items.put("A", 10);
    items.put("B", 20);
    items.put("C", 30);

    new ForEachMap().iterate(items);
  }

}