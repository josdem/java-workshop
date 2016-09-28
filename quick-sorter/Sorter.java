import java.util.List;
import java.util.Arrays;

public class Sorter {

  private List<Integer> sort(List<Integer> data){
    QuickSorter sorter = new QuickSorter();
    return sorter.sort(data);
  }

  private void print(List<Integer> data){
    data.forEach(item ->
      System.out.println(item)
    );
  }

  public static void main(String[] args){
    List<Integer> data = Arrays.asList(7,3,5,1,8,4,2,0,6,9);
    new Sorter().sort(data);
  }

}
