package com.andreas.football.club.management.mapper;

import com.andreas.football.club.management.dto.GetCoachDTO;
import com.andreas.football.club.management.dto.GetTeamDTO;
import com.andreas.football.club.management.model.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamMapper {

    public GetTeamDTO mapTeamDTO(Team team) {

        CoachMapper coachMapper = new CoachMapper();
        GetCoachDTO getCoachDTO = coachMapper.mapGetCoach(team.getCoach());

        return new GetTeamDTO(team.getUuid(), team.getName(),
                team.getHomeStadium(), team.getTrophies(), getCoachDTO, team.getTeamPlayers());
    }

    public List<GetTeamDTO> mapTeamsListDTO(List<Team> teamList) {

        List<GetTeamDTO> teamsDTO = new ArrayList<>();
        for (Team team : teamList) {
            teamsDTO.add(mapTeamDTO(team));
        }
        return teamsDTO;
    }
}

