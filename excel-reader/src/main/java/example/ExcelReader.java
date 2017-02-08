package example;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	List<String> readRows(Integer numberOfRows, File excelFile){
		List<String> content = new ArrayList<String>();
    try{
      FileInputStream fileInputStream = new FileInputStream(excelFile);
      Workbook workbook = new XSSFWorkbook(fileInputStream);
      Sheet sheet = workbook.getSheetAt(0);

      for (Row row : sheet) {
        for (Cell cell : row) {
          content.add(cell.getStringCellValue());
        }
      }          
    } catch(FileNotFoundException fne){
      throw new ExcelException(fne.getMessage(), fne);
    } catch(IOException ioe){
      throw new ExcelException(ioe.getMessage(), ioe);
    }

    return content;
  }

}