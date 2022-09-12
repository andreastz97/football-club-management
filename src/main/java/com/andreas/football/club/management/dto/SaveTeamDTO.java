package com.andreas.football.club.management.dto;

import java.util.List;

public class SaveTeamDTO {
    private String name;
    private String homeStadium;
    private int trophies;
    private String coachUuid;
    private List<String> playersUuid;

    public SaveTeamDTO(String name, String homeStadium, int trophies, String coachUuid, List<String> playersUuid) {
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
        this.coachUuid = coachUuid;
        this.playersUuid = playersUuid;
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

    public String getCoachUuid() {
        return coachUuid;
    }

    public void setCoachUuid(String coachUuid) {
        this.coachUuid = coachUuid;
    }

    public List<String> getPlayersUuid() {
        return playersUuid;
    }

    public void setPlayersUuid(List<String> playersUuid) {
        this.playersUuid = playersUuid;
    }
}
