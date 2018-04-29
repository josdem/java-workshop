package com.jos.dem.lambda.analyzer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnalyzerTest {

	@Test
	public void shouldKnowContainKeyword(){
		StringAnalyzer analyzer = new ContainsAnalyzer();
		assertTrue(analyzer.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life"));
	}

	@Test
	public void shouldKnowContainKeywordUsingLambda(){
		StringAnalyzer analyzer = (text, keyword) -> text.contains(keyword);
		assertTrue(analyzer.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life"));
	}

	@Test
	public void shouldAnalyzeUsingContainsAndEndsWith(){
		StringAnalyzer analyzerContains = (text, keyword) -> text.contains(keyword);
		StringAnalyzer analyzerEndsWith = (text, keyword) -> text.endsWith(keyword);

		assertTrue(analyzerContains.analyze("In the end, it's not the years in your life that count. It's the life in your years", "life"));
		assertTrue(analyzerEndsWith.analyze("In the end, it's not the years in your life that count. It's the life in your years", "years"));
	}

}