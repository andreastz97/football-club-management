package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.PositionType;

public class SavePlayerDTO extends SavePersonDTO {
    private PositionType position;
    private int goals;

    public SavePlayerDTO(String firstName, String lastName, int age, PositionType position, int goals) {
        super(firstName, lastName, age);
        this.position = position;
        this.goals = goals;
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
