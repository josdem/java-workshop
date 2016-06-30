import java.util.List;
import java.util.Arrays;

public class Sorter {

  private void list(){
    Integer data[] = {7,3,5,1,8,4,2,0,6,9};
    for(Integer integer: data){
      System.out.println(integer);
    }
  }

  public static void main(String[] args){
    new Sorter().list();
  }

}
