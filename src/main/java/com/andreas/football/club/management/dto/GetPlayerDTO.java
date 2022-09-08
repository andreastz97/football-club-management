package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.PositionType;

public class GetPlayerDTO extends GetPersonDTO{
    private PositionType position;
    private int goals;

    public GetPlayerDTO(String uuid, String firstName, String lastName, int age, PositionType position, int goals) {
        super(uuid, firstName, lastName, age);
        this.position = position;
        this.goals = goals;
    }

    public GetPlayerDTO(PositionType position, int goals) {
        this.position = position;
        this.goals = goals;
    }

    public GetPlayerDTO() {
    }

    public PositionType getPosition() {
        return position;
    }

    public void setPosition(PositionType position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}

