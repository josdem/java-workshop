package com.jos.dem.lambda.analyzer;

@FunctionalInterface
public interface StringAnalyzer {
  Boolean analyze(String text, String keyword);
}