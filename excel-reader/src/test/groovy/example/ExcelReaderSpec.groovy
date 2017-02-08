package example

import spock.lang.Specification

class ExcelReaderSpec extends Specification {

  ExcelReader excelReader = new ExcelReader()

	void "should read Excel rows"(){
    given:"An excel file"
      File excelFile = new File("src/test/resources/input.xlsx")
    when:"We read rows"
      List<List<String>> result = excelReader.readRows(excelFile)
    then:"We expect to get content"
    result.size() == 4
    result.get(0) == ['Name', 'Email', 'Ranking']
    result.get(1) == ['josdem','joseluis.delacruz@gmail.com','5.0']
    result.get(2) == ['eric','erich@email.com','5.0']
    result.get(3) == ['martin','martinv@email.com','5.0']
  }	

} 