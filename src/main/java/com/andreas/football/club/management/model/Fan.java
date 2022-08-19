package com.andreas.football.club.management.model;

import javax.persistence.*;

@Entity
@Table(name = "fans")
public class Fan extends Person {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_uuid")
    private Player player;

    private String favouriteTeam;

    public Fan() {
    }

    public Fan(String uuid, String firstName, String lastName, int age, String favouriteTeam) {
        super(uuid, firstName, lastName, age);
        this.favouriteTeam = favouriteTeam;
    }

    public Fan(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
}
