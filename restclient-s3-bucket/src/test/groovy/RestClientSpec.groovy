package example

import spock.lang.Specification

class RestClientSpec extends Specification {

  RestClient restClient = new RestClientImpl()

  void "should get file from bucket"(){
    expect:"A file"
      File file = restClient.sendRequest()
      file
  }	
	
}