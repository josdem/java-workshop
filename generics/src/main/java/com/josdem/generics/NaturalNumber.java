package com.josdem.generics;

public class NaturalNumber<N extends Number> {
  private final N number;

  public NaturalNumber(N number){
    this.number = number;
    if(number.intValue() < 0 ){
      throw new IllegalArgumentException();
    }
  }

  public boolean isEven() {
	  return this.number.intValue() % 2 == 0;
  }
}