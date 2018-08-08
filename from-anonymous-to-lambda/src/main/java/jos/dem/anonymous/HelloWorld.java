package com.jos.dem.anonymous;

public class HelloWorld implements GreetingService {

  @Override
  public String call(Greeting greeting){
    return greeting.hello();
  }

}
