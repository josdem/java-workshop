package com.example

import spock.lang.Specification

class ExcelFilterReaderSpec extends Specification {

  ExcelFilterReader excelReader = new ExcelFilterReader()

	void "should read filtered Excel rows"(){
		given:"Rows to read"
      Integer numberOfRows = 5
    and:"An excel file"
      File excelFile = new File("src/test/resources/input.xlsx")
    when:"We read rows"
      List<List<String>> result = excelReader.readRows(numberOfRows, excelFile)
    then:"We expect to get content"
    result.size() == 4
    result.get(0) == ['Name', 'Email', 'Ranking']
    result.get(1) == ['josdem','joseluis.delacruz@gmail.com','5.0']
    result.get(2) == ['martin','martinv@email.com','5.0']
  }	

} 