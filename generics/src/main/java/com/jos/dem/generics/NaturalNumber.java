package com.jos.dem.generics;

public class NaturalNumber<T extends Number> {
  private T number;

  public NaturalNumber(T number){
    this.number = number;
    if(number.intValue() < 0 ){
      throw new IllegalArgumentException();
    }
  }

  public boolean isEven() {
	  return this.number.intValue() % 2 == 0;
  }

}