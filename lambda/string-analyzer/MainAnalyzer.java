public class MainAnalyzer {

  public static void main(String[] args){
    StringAnalyzer analyzerContains = (String text, String keyword) -> text.contains(keyword);
    StringAnalyzer analyzerEndsWith = (String text, String keyword) -> text.endsWith(keyword);

    assert analyzerContains.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life");
    assert analyzerEndsWith.analyze("In the end, it's not the years in your life that count. It's the life in your years", "years");

  }

}

