package com.andreas.football.club.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "coaches")
public class Coach extends Person {
    @JsonIgnore
    @OneToOne
    private Team team;

    @Enumerated(EnumType.STRING)
    private TacticType tactic;

    public Coach() {
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Coach(String uuid, String firstName, String lastName, int age, TacticType tactic,Team team) {
        super(uuid, firstName, lastName, age);
        this.tactic = tactic;
        this.team = team;
    }

    public TacticType getTactic() {
        return tactic;
    }

    public void setTactic(TacticType tactic) {
        this.tactic = tactic;
    }

}
