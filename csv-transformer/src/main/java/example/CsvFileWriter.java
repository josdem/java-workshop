package example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;

public class CsvFileWriter {

  private static final String NEW_LINE_SEPARATOR = "\n";

  public void write(List<Target> targets, String path) {
    List elements = new ArrayList<List<String>>();
    try {
      FileWriter output = new FileWriter(path);
      CSVPrinter printer = CSVFormat.TDF.withHeader("id", "name", "email")
          .withRecordSeparator(NEW_LINE_SEPARATOR).print(output);

      for (Target target : targets) {
        List<String> record = new ArrayList<String>();
        record.add(target.getId());
        record.add(target.getName());
        record.add(target.getEmail());
        printer.printRecord(record);
      }

      output.flush();
      output.close();
    } catch (IOException ioe) {
      throw new CsvException(ioe.getMessage());
    }
  }

}
