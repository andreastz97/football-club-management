package com.andreas.football.club.management.dto;

public class SaveFanDTO extends SaveBaseEntityDTO{
    private String favouriteTeam;

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
}
