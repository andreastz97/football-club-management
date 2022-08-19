package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.TacticType;

public class SaveCoachDTO extends SavePersonDTO {
    private TacticType tactic;

    public TacticType getTactic() {
        return tactic;
    }

    public void setTactic(TacticType tactic) {
        this.tactic = tactic;
    }
}
