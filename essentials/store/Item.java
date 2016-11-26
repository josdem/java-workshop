import java.math.BigDecimal;

public class Item {

  private String name;
  private BigDecimal price;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setPrice(BigDecimal price){
    this.price = price;
  }

  public BigDecimal getPrice(){
    return this.price;
  }


}
