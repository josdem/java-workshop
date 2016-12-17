public class AnalyzerTool {

  public Boolean analyze(String text, String keyword, StringAnalyzer analizer){
    return analizer.analyze(text,keyword);
  }

}
