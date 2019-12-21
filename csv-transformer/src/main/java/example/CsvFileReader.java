package example;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvFileReader {

  public List<List<String>> read(String path){
    List elements = new ArrayList<List<String>>();
    try{
      FileReader input = new FileReader(path);
      Iterable<CSVRecord> records = CSVFormat.TDF.withHeader("id", "name", "email").parse(input);

      records.forEach(record -> {
            List<String> row = new ArrayList<String>();
            row.add(record.get("id"));
            row.add(record.get("name"));
            row.add(record.get("email"));
            elements.add(row);
          });
    } catch(IOException ioe){
      throw new CsvException(ioe.getMessage());
    }
    return elements;
  }

}
