package com.andreas.football.club.management.model;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
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


    public Team(String name, String homeStadium, int trophies, String uuid) {
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
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
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
