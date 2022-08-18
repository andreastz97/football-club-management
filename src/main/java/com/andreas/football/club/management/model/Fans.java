package com.andreas.football.club.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fans")
public class Fans extends BaseEntity {
    private String favouriteTeam;

    public Fans() {
        super();
    }

    public Fans(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
}
