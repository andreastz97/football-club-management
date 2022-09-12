package com.andreas.football.club.management.dto;

public class GetTeamDTO {
    private String uuid;
    private String name;
    private String homeStadium;
    private int trophies;
    private GetCoachDTO coachDTO;

    public GetTeamDTO(String uuid, String name, String homeStadium, int trophies, GetCoachDTO coachDTO) {
        this.uuid = uuid;
        this.name = name;
        this.homeStadium = homeStadium;
        this.trophies = trophies;
        this.coachDTO = coachDTO;
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



    public GetCoachDTO getCoachDTO() {
        return coachDTO;
    }

    public void setCoachDTO(GetCoachDTO coachDTO) {
        this.coachDTO = coachDTO;
    }
}
