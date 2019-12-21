package example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

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
        () -> assertEquals(4, result.size(), "should have four rows"),
        () -> assertTrue(result.contains(Arrays.asList("id","name","email")), "should have header"),
        () -> assertTrue(result.contains(Arrays.asList("1","eric","erich@email.com")), "should contain Eric"),
        () -> assertTrue(result.contains(Arrays.asList("2","martin","martinv@email.com")), "should contain Martin"),
        () -> assertTrue(result.contains(Arrays.asList("3","josdem","josdem@email.com")), "should contain josdem")
        );
  }


}