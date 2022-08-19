package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.PositionType;

public class SavePlayerDTO extends SaveBaseEntityDTO{
    private PositionType position;
    private int goals;

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
