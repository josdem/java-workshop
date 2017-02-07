package example

import spock.lang.Specification

class ExcelReaderSpec extends Specification {

  ExcelReader excelReader = new ExcelReader()

	void "should read Excel rows"(){
		given:"Rows to read"
      Integer numberOfRows = 5
    when:"We read rows"
      List<String> result = excelReader.read(numberOfRows)
    then:"We expect to get content"
    result.size() == 5
	}
	
}