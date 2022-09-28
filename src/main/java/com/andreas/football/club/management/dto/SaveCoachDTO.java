package com.andreas.football.club.management.dto;

import com.andreas.football.club.management.model.TacticType;

public class SaveCoachDTO extends SavePersonDTO {
    private TacticType tactic;
    private String teamUuid;

    public SaveCoachDTO(String firstName, String lastName, int age, TacticType tactic , String teamUuid) {
        super(firstName, lastName, age);
        this.tactic = tactic;
        this.teamUuid = teamUuid;
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

    public String getTeamUuid() {
        return teamUuid;
    }

    public void setTeamUuid(String teamUuid) {
        this.teamUuid = teamUuid;
    }
}
