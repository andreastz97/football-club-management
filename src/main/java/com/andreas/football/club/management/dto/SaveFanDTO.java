package com.andreas.football.club.management.dto;

public class SaveFanDTO extends SavePersonDTO {
    private String favouriteTeam;

    public SaveFanDTO(String firstName, String lastName, int age, String favouriteTeam) {
        super(firstName, lastName, age);
        this.favouriteTeam = favouriteTeam;
    }

    public SaveFanDTO(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
}
