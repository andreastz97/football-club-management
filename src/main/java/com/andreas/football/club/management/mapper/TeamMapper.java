package com.andreas.football.club.management.mapper;

import com.andreas.football.club.management.dto.GetCoachDTO;
import com.andreas.football.club.management.dto.GetTeamDTO;
import com.andreas.football.club.management.model.Coach;
import com.andreas.football.club.management.model.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamMapper {

    public GetTeamDTO map(Team team) {
        return new GetTeamDTO(team.getUuid(), team.getName(),
                team.getHomeStadium(), team.getTrophies(), mapGetCoachDTO(team.getCoach()));
    }

    public List<GetTeamDTO> mapTeamsList(List<Team> teamList) {

        List<GetTeamDTO> teamsDTO = new ArrayList<>();
        for (Team team : teamList) {
            teamsDTO.add(map(team));
        }
        return teamsDTO;
    }
    public GetCoachDTO mapGetCoachDTO(Coach coach) {
        return new GetCoachDTO(coach.getUuid(), coach.getFirstName(),
                coach.getLastName(), coach.getAge(), coach.getTactic());
    }

}

