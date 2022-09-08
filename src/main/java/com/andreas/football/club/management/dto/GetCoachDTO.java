package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.TacticType;

public class GetCoachDTO extends GetPersonDTO{
    private TacticType tactic;

    public GetCoachDTO(String uuid, String firstName, String lastName, int age, TacticType tactic) {
        super(uuid, firstName, lastName, age);
        this.tactic = tactic;
    }

    public GetCoachDTO(TacticType tactic) {
        this.tactic = tactic;
    }

    public GetCoachDTO() {
    }

    public TacticType getTactic() {
        return tactic;
    }

    public void setTactic(TacticType tactic) {
        this.tactic = tactic;
    }
}
