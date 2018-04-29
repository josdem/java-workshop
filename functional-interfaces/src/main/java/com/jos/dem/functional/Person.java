package com.jos.dem.functional;

public class Person {

	private String nickname;
	private Integer ranking;


	public Person(String nickname, Integer ranking){
		this.nickname = nickname;
		this.ranking = ranking;
	}

	public String getNickname() {
		return this.nickname;
	}

	public Integer getRanking() {
		return this.ranking;
	}

}