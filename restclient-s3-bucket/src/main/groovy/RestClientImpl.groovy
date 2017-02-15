package example

class RestClientImpl implements RestClient {

  void sendRequest(Command message){
    try{
      def rest = new RESTClient(emailerUrl)
      def response = rest.post(
        path: emailerPath,
        body: message,
        requestContentType: 'application/json' )
      response.responseData
    } catch(Exception ex) {
      log.warn "Error: ${ex.message}"
      throw new RestException(ex.message)
    }
  }

}