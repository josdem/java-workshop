public class MainAnalyzer {

  public static void main(String[] args){
    StringAnalyzer analyzer = (String text, String keyword) -> text.contains(keyword);
    assert analyzer.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life");
  }

}

