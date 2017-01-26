package example;

import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvFileReader {

	public void read(String path){

		try{
			FileReader input = new FileReader(path);
			Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader("id", "name", "email").parse(input);
			for (CSVRecord record : records) {
				String id = record.get("id");
				String name = record.get("name");
				String email = record.get("email");
				System.out.println("{id:" + id + ",name:" + name + ",email:" + email + "}");
			}
		} catch(IOException ioe){
			System.out.println("Error" + ioe.getMessage());
		}
	}

}

