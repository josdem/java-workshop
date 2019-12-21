package example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CsvFileReaderTest {

  private CsvFileWriter writer = new CsvFileWriter();

  @Test
  @DisplayName("Should read csv file")
  void shouldReadCsvFile(){
    String path = "src/test/resources/csv.txt";
    Target t1 = new Target(id:"1",name:"eric",email:"erich@email.com");
    Target t2 = new Target(id:"2",name:"martin",email:"martinv@email.com");
    Target t3 = new Target(id:"3",name:"josdem",email:"josdem@email.com");
    List<Target> targets = Arrays.asList(t1,t2,t3);

    writer.write(targets,path);
    File result = new File(path);

    //Read result file here
  }


}