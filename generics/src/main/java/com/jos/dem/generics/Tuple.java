package com.jos.dem.generics;

public class Tuple<T, U>{
    private final T nickname;
    private final U value;

    public Tuple(T nickname, U value){
        this.nickname = nickname;
        this.value = value;
    }

    @Override
    public String toString(){
        return nickname + ":" + value;
    }
}