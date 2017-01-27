package example;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

public class CsvFileReader {

	public List<String> read(String path){
    List<String> row = new ArrayList<String>();
    try{
     FileReader input = new FileReader(path);
     CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader("id", "name", "email");
     CSVParser csvFileParser = new CSVParser(input, csvFileFormat);
     List csvRecords = csvFileParser.getRecords(); 

     for (int i = 1; i < csvRecords.size(); i++) {
      CSVRecord record = (CSVRecord)csvRecords.get(i);
      String id = record.get("id");
      String name = record.get("name");
      String email = record.get("email");
      row.add(id);
      row.add(name);
      row.add(email);
     }
  } catch(IOException ioe){
    System.out.println("Error" + ioe.getMessage());
  }
  return row;
}

}

