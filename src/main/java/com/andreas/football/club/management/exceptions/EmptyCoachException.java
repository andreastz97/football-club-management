package com.andreas.football.club.management.exceptions;

public class EmptyCoachException extends RuntimeException{
    public EmptyCoachException() {
    }

    public EmptyCoachException(String message){
        super(message);
    }
}
