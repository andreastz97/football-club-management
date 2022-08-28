package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.TacticType;

public class SaveCoachDTO extends SavePersonDTO {
    private TacticType tactic;

    public SaveCoachDTO(String firstName, String lastName, int age, TacticType tactic) {
        super(firstName, lastName, age);
        this.tactic = tactic;
    }

    public SaveCoachDTO(TacticType tactic) {
        this.tactic = tactic;
    }

    public TacticType getTactic() {
        return tactic;
    }

    public void setTactic(TacticType tactic) {
        this.tactic = tactic;
    }
}
