package com.andreas.football.club.management.dto;

import java.util.List;

public class GetTeamDTO {
    private String uuid;
    private String name;
    private String homeStadium;
    private int trophies;
    private GetCoachDTO coach;
    private List<GetPlayerDTO> players;

    public GetTeamDTO(String uuid, String name, String homeStadium, int trophies, GetCoachDTO coach, List<GetPlayerDTO> players) {
        this.uuid = uuid;
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
        this.coach = coach;
        this.players = players;
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

    public GetCoachDTO getCoach() {
        return coach;
    }

    public void setCoach(GetCoachDTO coach) {
        this.coach = coach;
    }

    public List<GetPlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<GetPlayerDTO> players) {
        this.players = players;
    }
}
