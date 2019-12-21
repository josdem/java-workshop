package example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CsvFileReaderTest {

  private CsvFileReader reader = new CsvFileReader();

  @Test
  @DisplayName("Should read csv file")
  void shouldReadCsvFile(){
    String path = "src/test/resources/csv.txt";
    List<List<String>> result = reader.read(path);

    assertAll("rows",
        () -> assertEquals(4, result.size(), "should have four rows")
        );
  }


}