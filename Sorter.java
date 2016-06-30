import java.util.List;
import java.util.Arrays;

public class Sorter {

  private void list(){
    List<Integer> data = Arrays.asList(7,3,5,1,8,4,2,0,6,9);
    data.forEach(item ->
      System.out.println(item)
    );
  }

  public static void main(String[] args){
    new Sorter().list();
  }

}
