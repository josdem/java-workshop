import java.util.List;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.stream.Collectors;

public class ListSorter {

	private List<BigDecimal> sort(List<BigDecimal> prices){
		return prices.stream().sorted( (p1, p2) -> p1.compareTo(p2) ).toList();
	}

	public static void main(String[] args){
		var prices = Arrays.asList(
			new BigDecimal("10.25"),
			new BigDecimal("25.90"),
			new BigDecimal("41.60"),
			new BigDecimal("9.50")
	  );

    var result = new ListSorter().sort(prices);
    assert 4 == result.size();
    assert new BigDecimal("9.50").equals(result.get(0));
    assert new BigDecimal("41.60").equals(result.get(3));
  }

}
