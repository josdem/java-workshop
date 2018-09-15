package com.jos.dem.lambda.analyzer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AnalyzerTest {

	@Test
  @DisplayName("Understands how to validate a keyword is present")
	public void shouldKnowContainKeyword(){
		StringAnalyzer analyzer = new ContainsAnalyzer();
		assertTrue(analyzer.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life"));
	}

	@Test
  @DisplayName("Understands how to validate a keyword is present using lambda expressions")
	public void shouldKnowContainKeywordUsingLambda(){
		StringAnalyzer analyzer = (text, keyword) -> text.contains(keyword);
		assertTrue(analyzer.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life"));
	}

	@Test
  @DisplayName("Understands how to validate a keyword is present and ends with using lambda expressions")
	public void shouldAnalyzeUsingContainsAndEndsWith(){
		StringAnalyzer analyzerContains = (text, keyword) -> text.contains(keyword);
		StringAnalyzer analyzerEndsWith = (text, keyword) -> text.endsWith(keyword);

		assertTrue(analyzerContains.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life"));
		assertTrue(analyzerEndsWith.analyze("In the end, it's not the years in your life that count. It's the life in your years", "years"));
	}

}
