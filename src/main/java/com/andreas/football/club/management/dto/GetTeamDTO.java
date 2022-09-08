package com.andreas.football.club.management.dto;

public class GetTeamDTO {
    private String uuid;
    private String name;
    private String homeStadium;
    private int trophies;

    public GetTeamDTO(String uuid, String name, String homeStadium, int trophies) {
        this.uuid = uuid;
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
    }

    public GetTeamDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
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
}
