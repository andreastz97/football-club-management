package com.andreas.football.club.management.model;

import javax.persistence.*;

@Entity
@Table(name = "coaches")
public class Coach extends Person {

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

    public Coach(String uuid, String firstName, String lastName, int age, TacticType tactic) {
        super(uuid, firstName, lastName, age);
        this.tactic = tactic;
    }

    public TacticType getTactic() {
        return tactic;
    }

    public void setTactic(TacticType tactic) {
        this.tactic = tactic;
    }
}
