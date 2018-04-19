import spock.lang.Specification

class GenericsTypeSpec extends Specification{

  void "should create a generic type and cast to string"(){
    given:'A generic type'
      GenericType<String> type = new GenericType<String>()
    when:'I create a string type'
      type.set('josdem');  
    then:'I expect to get the string'
      'josdem' == type.get();  
  }

}