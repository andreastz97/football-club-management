package com.andreas.football.club.management.model;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends BaseEntity {

    //@ManyToOne(mappedBy = "player")

    @Enumerated(EnumType.STRING)
    private PositionType position;
    private int goals;

    public Player() {
        super();
    }

    public Player(String uuid, String firstName, String lastName, int age,PositionType position, int goals) {
        super(uuid,firstName,lastName,age);
        this.position = position;
        this.goals = goals;
    }
}
