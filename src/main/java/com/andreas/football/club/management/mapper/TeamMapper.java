package com.andreas.football.club.management.mapper;

import com.andreas.football.club.management.dto.GetCoachDTO;
import com.andreas.football.club.management.dto.GetPlayerDTO;
import com.andreas.football.club.management.dto.GetTeamDTO;
import com.andreas.football.club.management.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeamMapper {
    @Autowired
    PlayerMapper playerMapper;

    public GetTeamDTO mapTeamDTO(Team team) {

        List<GetPlayerDTO> getPlayerDTO = playerMapper.mapPLayerList(team.getTeamPlayers());

        CoachMapper coachMapper = new CoachMapper();
        GetCoachDTO getCoachDTO = coachMapper.mapGetCoach(team.getCoach());

        return new GetTeamDTO(team.getUuid(), team.getName(),
                team.getHomeStadium(), team.getTrophies(), getCoachDTO, getPlayerDTO);
    }

    public List<GetTeamDTO> mapTeamsListDTO(List<Team> teamList) {

        List<GetTeamDTO> teamsDTO = new ArrayList<>();
        for (Team team : teamList) {
            teamsDTO.add(mapTeamDTO(team));
        }
        return teamsDTO;
    }
}

