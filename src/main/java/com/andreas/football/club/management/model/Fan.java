package com.andreas.football.club.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "fans")
public class Fan extends Person {
    @Column(name = "favourite_team")
    private String favouriteTeam;

    @JsonIgnore
    @ManyToMany(mappedBy = "fansOfPLayers")
    private Set<Player> favouritePlayers = new HashSet<>();

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

    public Set<Player> getFavouritePlayers() {
        return favouritePlayers;
    }
}
