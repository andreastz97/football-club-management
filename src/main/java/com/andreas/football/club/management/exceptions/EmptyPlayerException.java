package com.andreas.football.club.management.exceptions;

public class EmptyPlayerException extends RuntimeException{
    public EmptyPlayerException() {
    }
    public EmptyPlayerException(String message){
        super(message);
    }
}
