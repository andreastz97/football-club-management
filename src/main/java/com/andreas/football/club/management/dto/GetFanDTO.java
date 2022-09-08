package com.andreas.football.club.management.dto;

public class GetFanDTO extends GetPersonDTO{
    private String favouriteTeam;

    public GetFanDTO(String uuid, String firstName, String lastName, int age, String favouriteTeam) {
        super(uuid, firstName, lastName, age);
        this.favouriteTeam = favouriteTeam;
    }

    public GetFanDTO(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    public GetFanDTO() {
    }

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
}
