package com.andreas.football.club.management.model;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "fans")
public class Fan extends Person {

    @ManyToMany(mappedBy = "fansOfPLayers")
    @JoinTable(name = "fans_of_players",
            joinColumns = @JoinColumn(name = "fan_uuid"),
            inverseJoinColumns = @JoinColumn(name = "player_uuid"))

    Set<Player> favouritePlayers = new HashSet<>();

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

    public Set<Player> getFavouritePlayers() {
        return favouritePlayers;
    }
}
