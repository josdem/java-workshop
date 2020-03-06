package com.jos.dem.generics;

public class Box<T> {
  private T type;

  public T get(){
    return this.type;
  }

  public void set(T type){
    this.type = type;
  }

}