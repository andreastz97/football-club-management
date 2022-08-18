package com.andreas.football.club.management.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private PositionType position;
    private int goals;

    public Player() {
        super();
    }

    public Player(PositionType position, int goals) {
        this.position = position;
        this.goals = goals;
    }
}
