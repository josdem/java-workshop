package example

import spock.lang.Specification

class ExcelReaderSpec extends Specification {

  ExcelReader excelReader = new ExcelReader()

	void "should read Excel rows"(){
		given:"Rows to read"
      Integer numberOfRows = 5
    and:"An excel file"
      File excelFile = new File("src/test/resources/input.xlsx")
    when:"We read rows"
      List<String> result = excelReader.readRows(numberOfRows, excelFile)
    then:"We expect to get content"
    result.size() == 5
	}
	
} 