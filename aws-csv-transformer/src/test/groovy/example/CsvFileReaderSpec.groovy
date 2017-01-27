package example;

import spock.lang.Specification;

class CsvFileReaderSpec extends Specification {

	CsvFileReader reader = new CsvFileReader()

	void "Should read csv file"(){
		given:"A path"
    String path = 'src/test/resources/csv.txt'
    when:
    def result = reader.read(path);
    then:
    result.size() == 1
  }


}