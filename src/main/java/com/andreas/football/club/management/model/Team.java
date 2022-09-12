package com.andreas.football.club.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {
    @JsonIgnore
    @OneToMany(mappedBy = "team")
    private List<Player> teamPlayers = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "coach_uuid", referencedColumnName = "uuid")
    private Coach coach;

    @Id
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "home_stadium")
    private String homeStadium;
    @Column(name = "trophies")
    private int trophies;

    public Team() {
    }

    public Team(String uuid) {
    }

    public Team(String uuid, String name, String homeStadium, int trophies) {
        this.uuid = uuid;
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeStadium() {
        return homeStadium;
    }

    public void setHomeStadium(String homeStadium) {
        this.homeStadium = homeStadium;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public List<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(List<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

}
