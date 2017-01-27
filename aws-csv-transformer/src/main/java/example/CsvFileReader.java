package example;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvFileReader {
  Iterable<CSVRecord> records;

  public List<List<String>> read(String path){
    List elements = new ArrayList<List<String>>();
    try{
      FileReader input = new FileReader(path);
      Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("id", "name", "email").parse(input);
      for (CSVRecord record : records) {
        List<String> row = new ArrayList<String>();
        String id = record.get("id");
        String name = record.get("name");
        String email = record.get("email");
        row.add(id);
        row.add(name);
        row.add(email);
        elements.add(row);
      }
    } catch(IOException ioe){
      System.out.println("Error" + ioe.getMessage());
    }
    return elements;
  }

}
