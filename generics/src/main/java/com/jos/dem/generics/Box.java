package com.jos.dem.generics;

public class Box<T> {
  private T type;

  public T get(){
    return this.type;
  }

  public void set(T type){
    this.type = type;
  }

  public String getClassTypeName(){
    return type.getClass().getName();
  }

  public <U extends Number> String getClassNumberName(U unit){
    return unit.getClass().getName();
  }

}