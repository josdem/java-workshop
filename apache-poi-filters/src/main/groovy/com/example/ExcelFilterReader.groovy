package com.example

import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ExcelFilterReader {

	List<String> readRows(Integer numberOfRows, File excelFile){
		List content = new ArrayList<ArrayList<String>>()
    List line = new ArrayList<String>()
    try{
      FileInputStream fileInputStream = new FileInputStream(excelFile)
      Workbook workbook = new XSSFWorkbook(fileInputStream)
      Sheet sheet = workbook.getSheetAt(0)

      for (Row row : sheet) {
      	println "Is hidden?: ${row.getRowStyle().getHidden()}"
      }
    } catch(FileNotFoundException fne){
      throw new ExcelException(fne.getMessage(), fne)
    } catch(IOException ioe){
      throw new ExcelException(ioe.getMessage(), ioe)
    }

    return content
  }
	
}