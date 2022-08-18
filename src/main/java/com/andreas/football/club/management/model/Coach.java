package com.andreas.football.club.management.model;
import javax.persistence.*;

@Entity
@Table(name = "coaches")
public class Coach extends BaseEntity {
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "coaches_team")
    private Team team;

    @Enumerated(EnumType.STRING)
    private TacticType tactic;

    public Coach() {
    }

    public Coach(String uuid, String firstName, String lastName, int age, TacticType tactic) {
        super(uuid, firstName, lastName, age);
        this.tactic = tactic;
    }
}
