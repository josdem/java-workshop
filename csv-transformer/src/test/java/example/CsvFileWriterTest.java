package example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CsvFileWriterTest {

  private CsvFileWriter writer = new CsvFileWriter();

  @Test
  @DisplayName("Should write csv file")
  void shouldWriteCsvFile() throws Exception {
    String path = "src/test/resources/csv.txt";
    Target t1 = new Target("1","eric","erich@email.com");
    Target t2 = new Target("2","martin","martinv@email.com");
    Target t3 = new Target("3","josdem","josdem@email.com");

    List<Target> targets = Arrays.asList(t1,t2,t3);

    writer.write(targets,path);

    Files.lines(Paths.get(path)).forEach(System.out::println);

  }


}