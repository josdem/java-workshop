import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileStreamer {

	private List<String> read(Path path) throws IOException {
    return Files.lines(path).collect(Collectors.toList());
	}
	
  public static void main(String[] args) throws IOException {
  	Path path = Paths.get("../resources/nicknames.txt");
    List<String> result = new FileStreamer().read(path);
    assert result.size() == 6;
    assert result.contains("josdem");
  }

}