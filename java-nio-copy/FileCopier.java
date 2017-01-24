import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopier {

  private void copy(Path source, Path target){
    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("file: " + source + " was copied successfully");
    } catch (IOException ioe) {
      System.out.println("Error: " + ioe.getMessage());
    }
  }

  public static void main(String[] args) {
    Path source = Paths.get("source/HappyFace.jpg");
    Path target = Paths.get("destination/HappyFace.jpg");
    FileCopier fileCopier = new FileCopier();
    fileCopier.copy(source, target);
  }

}