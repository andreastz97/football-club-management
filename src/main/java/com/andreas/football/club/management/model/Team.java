package com.andreas.football.club.management.model;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team extends BaseEntity{
    @Column(name = "home_stadium")
    private String homeStadium;

    @Column(name = "trophies")
    private int trophies;

    public Team() {
    }

    public Team(String name, String homeStadium, int trophies, String uuid) {
        super();
        this.homeStadium = homeStadium;
        this.trophies = trophies;

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

}
