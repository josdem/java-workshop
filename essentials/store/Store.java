import java.math.BigDecimal;

public class Store {

  public static void main(String[] args){
    Item item = new Item();
    item.setName("Leche");
    item.setPrice(new BigDecimal(23.50));
    System.out.println(item.getName() + ":" + item.getPrice());
  }

}
