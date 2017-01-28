package example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;


public class CsvFileWriter {

  public void write(List<Target> targets, String path){
    List elements = new ArrayList<List<String>>();
    try{
      FileWriter output = new FileWriter(path);
      CSVPrinter printer = CSVFormat.TDF.withHeader("id", "name", "email").print(output);
      printer.print(targets);
    } catch(IOException ioe){
      throw new CsvException(ioe.getMessage());
    }
  }

}
