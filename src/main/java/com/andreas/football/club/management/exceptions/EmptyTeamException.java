package com.andreas.football.club.management.exceptions;

public class EmptyTeamException extends RuntimeException{
    public EmptyTeamException() {
    }

    public EmptyTeamException(String message){
        super(message);
    }
}
