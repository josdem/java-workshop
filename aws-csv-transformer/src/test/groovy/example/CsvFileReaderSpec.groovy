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
		result.size() == 4
    result.get(0) == ['id','name','email']
    result.get(1) == ['1','eric','erich@email.com']
    result.get(2) == ['2','martin','martinv@email.com']
    result.get(3) == ['3','josdem','josdem@email.com']
	}


}
