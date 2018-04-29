package com.jos.dem.lambda.analyzer;

public class ContainsAnalyzer implements StringAnalyzer {

  public Boolean analyze(String text, String keyword){
    return text.contains(keyword);
  }

}