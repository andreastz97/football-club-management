package com.andreas.football.club.management.dto;

public class SaveTeamDTO {
    private String name;
    private String homeStadium;
    private int trophies;

    public SaveTeamDTO(String name, String homeStadium, int trophies) {
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
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
}
