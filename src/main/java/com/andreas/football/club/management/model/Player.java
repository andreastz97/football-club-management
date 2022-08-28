package com.andreas.football.club.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "players")
public class Player extends Person {

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "players_fans",
            joinColumns = @JoinColumn(name = "fan_uuid"),
            inverseJoinColumns = @JoinColumn(name = "player_uuid")
    )
    private Set<Fan> fansOfPLayers = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_uuid")
    private Team team;

    @Enumerated(EnumType.STRING)
    private PositionType position;
    private int goals;


    public Player() {
    }

    public Player(String uuid) {
    }


    public Player(String uuid, String firstName, String lastName, int age, PositionType position, int goals) {
        super(uuid, firstName, lastName, age);
        this.position = position;
        this.goals = goals;
    }

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Set<Fan> getFansOfPLayers() {
        return fansOfPLayers;
    }
}
